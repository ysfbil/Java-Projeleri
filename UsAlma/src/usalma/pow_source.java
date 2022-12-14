/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package usalma;

/**
 *
 * @author ysfbil
 */
public class pow_source {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("args = " + pow(3.3,4.4));
    }
    
      private static final double zero = 0.0, one = 1.0, two = 2.0, tiny = 1.0e-300, huge = 1.0e+300,
            two53 = 9007199254740992.0, /* 0x43400000, 0x00000000 */
            two54 = 1.80143985094819840000e+16, /* 0x43500000, 0x00000000 */
            twom54 = 5.55111512312578270212e-17, /* 0x3C900000, 0x00000000 */
            P1 = 1.66666666666666019037e-01, /* 0x3FC55555, 0x5555553E */
            P2 = -2.77777777770155933842e-03, /* 0xBF66C16C, 0x16BEBD93 */
            P3 = 6.61375632143793436117e-05, /* 0x3F11566A, 0xAF25DE2C */
            P4 = -1.65339022054652515390e-06, /* 0xBEBBBD41, 0xC5D26BF1 */
            P5 = 4.13813679705723846039e-08;
    private static final long HI_MASK = 0xffffffff00000000L, LO_MASK = 0x00000000ffffffffL;
    private static final int HI_SHIFT = 32;
    private static final double bp[] = { 1.0, 1.5, },
            dp_h[] = { 0.0, 5.84962487220764160156e-01, }, /* 0x3FE2B803, 0x40000000 */
            dp_l[] = { 0.0, 1.35003920212974897128e-08, }, /* 0x3E4CFDEB, 0x43CFD006 */
            /* poly coefs for (3/2)*(log(x)-2s-2/3*s**3 */
            L1 = 5.99999999999994648725e-01, /* 0x3FE33333, 0x33333303 */
            L2 = 4.28571428578550184252e-01, /* 0x3FDB6DB6, 0xDB6FABFF */
            L3 = 3.33333329818377432918e-01, /* 0x3FD55555, 0x518F264D */
            L4 = 2.72728123808534006489e-01, /* 0x3FD17460, 0xA91D4101 */
            L5 = 2.30660745775561754067e-01, /* 0x3FCD864A, 0x93C9DB65 */
            L6 = 2.06975017800338417784e-01, /* 0x3FCA7E28, 0x4A454EEF */
            lg2 = 6.93147180559945286227e-01, /* 0x3FE62E42, 0xFEFA39EF */
            lg2_h = 6.93147182464599609375e-01, /* 0x3FE62E43, 0x00000000 */
            lg2_l = -1.90465429995776804525e-09, /* 0xBE205C61, 0x0CA86C39 */
            ovt = 8.0085662595372944372e-0017, /* -(1024-log2(ovfl+.5ulp)) */
            cp = 9.61796693925975554329e-01, /* 0x3FEEC709, 0xDC3A03FD =2/(3ln2) */
            cp_h = 9.61796700954437255859e-01, /* 0x3FEEC709, 0xE0000000 =(float)cp */
            cp_l = -7.02846165095275826516e-09, /* 0xBE3E2FE0, 0x145B01F5 =tail of cp_h*/
            ivln2 = 1.44269504088896338700e+00, /* 0x3FF71547, 0x652B82FE =1/ln2 */
            ivln2_h = 1.44269502162933349609e+00, /* 0x3FF71547, 0x60000000 =24b 1/ln2*/
            ivln2_l = 1.92596299112661746887e-08;

    
//    /**//from  w  w w . ja v a 2s.  co m
//     * Return a to the power of b, sometimes written as a ** b 
//     * but not to be confused with the bitwise ^ operator.
//     * This in turn uses ieee7854_log(double).
//     */
    public static final double pow(double a, double b) {
        return ieee754_pow(a, b);
    }

    private static final double ieee754_pow(double x, double y) {
        double z, ax, z_h, z_l, p_h, p_l;
        double y1, t1, t2, r, s, t, u, v, w;
        //int i0,i1;
        int i, j, k, yisint, n;
        int hx, hy, ix, iy;
        int lx, ly;

        //i0 = (int)((Double.doubleToLongBits(one)) >>> (29+HI_SHIFT))^1;
        //i1 = 1-i0;
        hx = (int) (Double.doubleToLongBits(x) >>> HI_SHIFT);
        lx = (int) (Double.doubleToLongBits(x) & LO_MASK);
        hy = (int) (Double.doubleToLongBits(y) >>> HI_SHIFT);
        ly = (int) (Double.doubleToLongBits(y) & LO_MASK);
        ix = hx & 0x7fffffff;
        iy = hy & 0x7fffffff;

        /* y==zero: x**0 = 1 */
        if ((iy | ly) == 0)
            return one;

        /* +-NaN return x+y */
        if (ix > 0x7ff00000 || ((ix == 0x7ff00000) && (lx != 0)) || iy > 0x7ff00000
                || ((iy == 0x7ff00000) && (ly != 0)))
            return x + y;

        /* determine if y is an odd int when x < 0
         * yisint = 0   ... y is not an integer
         * yisint = 1   ... y is an odd int
         * yisint = 2   ... y is an even int
         */
        yisint = 0;
        if (hx < 0) {
            if (iy >= 0x43400000)
                yisint = 2; /* even integer y */
            else if (iy >= 0x3ff00000) {
                k = (iy >> 20) - 0x3ff; /* exponent */
                if (k > 20) {
                    j = ly >> (52 - k);
                    if ((j << (52 - k)) == ly)
                        yisint = 2 - (j & 1);
                } else if (ly == 0) {
                    j = iy >> (20 - k);
                    if ((j << (20 - k)) == iy)
                        yisint = 2 - (j & 1);
                }
            }
        }

        /* special value of y */
        if (ly == 0) {
            if (iy == 0x7ff00000) { /* y is +-inf */
                if (((ix - 0x3ff00000) | lx) == 0)
                    return y - y; /* inf**+-1 is NaN */
                else if (ix >= 0x3ff00000)/* (|x|>1)**+-inf = inf,0 */
                    return (hy >= 0) ? y : zero;
                else /* (|x|<1)**-,+inf = inf,0 */
                    return (hy < 0) ? -y : zero;
            }
            if (iy == 0x3ff00000) { /* y is  +-1 */
                if (hy < 0)
                    return one / x;
                else
                    return x;
            }
            if (hy == 0x40000000)
                return x * x; /* y is  2 */
            if (hy == 0x3fe00000) { /* y is  0.5 */
                if (hx >= 0) /* x >= +0 */
                    return Math.sqrt(x);
            }
        }

        ax = Math.abs(x);
        /* special value of x */
        if (lx == 0) {
            if (ix == 0x7ff00000 || ix == 0 || ix == 0x3ff00000) {
                z = ax; /*x is +-0,+-inf,+-1*/
                if (hy < 0)
                    z = one / z; /* z = (1/|x|) */
                if (hx < 0) {
                    if (((ix - 0x3ff00000) | yisint) == 0) {
                        z = (z - z) / (z - z); /* (-1)**non-int is NaN */
                    } else if (yisint == 1)
                        z = -z; /* (x<0)**odd = -(|x|**odd) */
                }
                return z;
            }
        }

        n = (hx >>> 31) + 1;

        /* (x<0)**(non-int) is NaN */
        if ((n | yisint) == 0)
            return (x - x) / (x - x);

        s = one; /* s (sign of result -ve**odd) = -1 else = 1 */
        if ((n | (yisint - 1)) == 0)
            s = -one;/* (-ve)**(odd int) */

        /* |y| is huge */
        if (iy > 0x41e00000) { /* if |y| > 2**31 */
            if (iy > 0x43f00000) { /* if |y| > 2**64, must o/uflow */
                if (ix <= 0x3fefffff)
                    return (hy < 0) ? huge * huge : tiny * tiny;
                if (ix >= 0x3ff00000)
                    return (hy > 0) ? huge * huge : tiny * tiny;
            }
            /* over/underflow if x is not close to one */
            if (ix < 0x3fefffff)
                return (hy < 0) ? s * huge * huge : s * tiny * tiny;
            if (ix > 0x3ff00000)
                return (hy > 0) ? s * huge * huge : s * tiny * tiny;
            /* now |1-x| is tiny <= 2**-20, suffice to compute 
               log(x) by x-x^2/2+x^3/3-x^4/4 */
            t = x - one; /* t has 20 trailing zeros */
            w = (t * t) * (0.5 - t * (0.3333333333333333333333 - t * 0.25));
            u = ivln2_h * t; /* ivln2_h has 21 sig. bits */
            v = t * ivln2_l - w * ivln2;
            t1 = u + v;
            //__LO(t1) = 0; // keep high word
            t1 = Double.longBitsToDouble(Double.doubleToLongBits(t1) & HI_MASK);
            t2 = v - (t1 - u);
        } else {
            double ss, s2, s_h, s_l, t_h, t_l;
            n = 0;
            /* take care subnormal number */
            if (ix < 0x00100000) {
                ax *= two53;
                n -= 53;
                ix = (int) (Double.doubleToLongBits(ax) >>> HI_SHIFT);
            }
            n += ((ix) >> 20) - 0x3ff;
            j = ix & 0x000fffff;
            /* determine interval */
            ix = j | 0x3ff00000; /* normalize ix */
            if (j <= 0x3988E)
                k = 0; /* |x|<sqrt(3/2) */
            else if (j < 0xBB67A)
                k = 1; /* |x|<sqrt(3)   */
            else {
                k = 0;
                n += 1;
                ix -= 0x00100000;
            }
            //__HI(ax) = ix;
            ax = Double.longBitsToDouble(((long) ix << HI_SHIFT) | (Double.doubleToLongBits(ax) & LO_MASK));

            /* compute ss = s_h+s_l = (x-1)/(x+1) or (x-1.5)/(x+1.5) */
            u = ax - bp[k]; /* bp[0]=1.0, bp[1]=1.5 */
            v = one / (ax + bp[k]);
            ss = u * v;
            s_h = ss;
            //__LO(s_h) = 0; // keep high word
            s_h = Double.longBitsToDouble(Double.doubleToLongBits(s_h) & HI_MASK);
            /* t_h=ax+bp[k] High */
            t_h = zero;
            //__HI(t_h)=((ix>>1)|0x20000000)+0x00080000+(k<<18);
            t_h = Double
                    .longBitsToDouble(((long) ((int) ((ix >> 1) | 0x20000000) + 0x00080000 + (k << 18)) << HI_SHIFT)
                            | (Double.doubleToLongBits(t_h) & LO_MASK));
            t_l = ax - (t_h - bp[k]);
            s_l = v * ((u - s_h * t_h) - s_h * t_l);
            /* compute log(ax) */
            s2 = ss * ss;
            r = s2 * s2 * (L1 + s2 * (L2 + s2 * (L3 + s2 * (L4 + s2 * (L5 + s2 * L6)))));
            r += s_l * (s_h + ss);
            s2 = s_h * s_h;
            t_h = 3.0 + s2 + r;
            //__LO(t_h) = 0; // keep high word
            t_h = Double.longBitsToDouble(Double.doubleToLongBits(t_h) & HI_MASK);
            t_l = r - ((t_h - 3.0) - s2);
            /* u+v = ss*(1+...) */
            u = s_h * t_h;
            v = s_l * t_h + t_l * ss;
            /* 2/(3log2)*(ss+...) */
            p_h = u + v;
            //__LO(p_h) = 0; // keep high word
            p_h = Double.longBitsToDouble(Double.doubleToLongBits(p_h) & HI_MASK);
            p_l = v - (p_h - u);
            z_h = cp_h * p_h; /* cp_h+cp_l = 2/(3*log2) */
            z_l = cp_l * p_h + p_l * cp + dp_l[k];
            /* log2(ax) = (ss+..)*2/(3*log2) = n + dp_h + z_h + z_l */
            t = (double) n;
            t1 = (((z_h + z_l) + dp_h[k]) + t);
            //__LO(t1) = 0; // keep high word
            t1 = Double.longBitsToDouble(Double.doubleToLongBits(t1) & HI_MASK);
            t2 = z_l - (((t1 - t) - dp_h[k]) - z_h);
        }

        /* split up y into y1+y2 and compute (y1+y2)*(t1+t2) */
        y1 = y;
        //__LO(y1) = 0; // keep high word
        y1 = Double.longBitsToDouble(Double.doubleToLongBits(y1) & HI_MASK);
        p_l = (y - y1) * t1 + y * t2;
        p_h = y1 * t1;
        z = p_l + p_h;
        j = (int) (Double.doubleToLongBits(z) >>> HI_SHIFT);
        i = (int) (Double.doubleToLongBits(z) & LO_MASK);
        if (j >= 0x40900000) { /* z >= 1024 */
            if (((j - 0x40900000) | i) != 0) /* if z > 1024 */
                return s * huge * huge; /* overflow */
            else {
                if (p_l + ovt > z - p_h)
                    return s * huge * huge; /* overflow */
            }
        } else if ((j & 0x7fffffff) >= 0x4090cc00) { /* z <= -1075 */
            if (((j - 0xc090cc00) | i) != 0) /* z < -1075 */
                return s * tiny * tiny; /* underflow */
            else {
                if (p_l <= z - p_h)
                    return s * tiny * tiny; /* underflow */
            }
        }
        /*
         * compute 2**(p_h+p_l)
         */
        i = j & 0x7fffffff;
        k = (i >> 20) - 0x3ff;
        n = 0;
        if (i > 0x3fe00000) { /* if |z| > 0.5, set n = [z+0.5] */
            n = j + (0x00100000 >> (k + 1));
            k = ((n & 0x7fffffff) >> 20) - 0x3ff; /* new k for n */
            t = zero;
            //__HI(t) = (n&~(0x000fffff>>k));
            t = Double.longBitsToDouble(
                    ((long) (n & ~(0x000fffff >> k)) << HI_SHIFT) | (Double.doubleToLongBits(t) & LO_MASK));
            n = ((n & 0x000fffff) | 0x00100000) >> (20 - k);
            if (j < 0)
                n = -n;
            p_h -= t;
        }
        t = p_l + p_h;
        //__LO(t) = 0; // keep high word
        t = Double.longBitsToDouble(Double.doubleToLongBits(t) & HI_MASK);
        u = t * lg2_h;
        v = (p_l - (t - p_h)) * lg2 + t * lg2_l;
        z = u + v;
        w = v - (z - u);
        t = z * z;
        t1 = z - t * (P1 + t * (P2 + t * (P3 + t * (P4 + t * P5))));
        r = (z * t1) / (t1 - two) - (w + z * w);
        z = one - (r - z);
        j = (int) ((long) Double.doubleToLongBits(z) >>> HI_SHIFT);
        j += (n << 20);
        if ((j >> 20) <= 0)
            z = scalbn(z, n); /* subnormal output */
        else //__HI(z) = j;
            z = Double.longBitsToDouble(((long) j << HI_SHIFT) | (Double.doubleToLongBits(z) & LO_MASK));
        return s * z;
    }

    /** 
     * scalbn (double x, int n)
     * scalbn(x,n) returns x* 2**n  computed by  exponent  
     * manipulation rather than by actually performing an 
     * exponentiation or a multiplication.
     */
    public static final double scalbn(double x, int n) {
        int k, hx, lx;
        hx = (int) (Double.doubleToLongBits(x) >>> HI_SHIFT);
        lx = (int) (Double.doubleToLongBits(x) & LO_MASK);
        k = (hx & 0x7ff00000) >> 20; /* extract exponent */
        if (k == 0) { /* 0 or subnormal x */
            if ((lx | (hx & 0x7fffffff)) == 0)
                return x; /* +-0 */
            x *= two54;
            hx = (int) (Double.doubleToLongBits(x) >>> HI_SHIFT);
            k = ((hx & 0x7ff00000) >> 20) - 54;
            if (n < -50000)
                return tiny * x; /*underflow*/
        }
        if (k == 0x7ff)
            return x + x; /* NaN or Inf */
        k = k + n;
        if (k > 0x7fe)
            return huge * copysign(huge, x); /* overflow  */
        if (k > 0) /* normal result */
        {
            //__HI(x) = (hx&0x800fffff)|(k<<20);
            x = Double.longBitsToDouble(((long) ((int) (hx & 0x800fffff) | (k << 20)) << HI_SHIFT)
                    | (Double.doubleToLongBits(x) & LO_MASK));
            return x;
        }
        if (k <= -54)
            if (n > 50000) /* in case integer overflow in n+k */
                return huge * copysign(huge, x); /*overflow*/
            else
                return tiny * copysign(tiny, x); /*underflow*/
        k += 54; /* subnormal result */
        //__HI(x) = (hx&0x800fffff)|(k<<20);
        x = Double.longBitsToDouble(((long) ((int) (hx & 0x800fffff) | (k << 20)) << HI_SHIFT)
                | (Double.doubleToLongBits(x) & LO_MASK));
        return x * twom54;
    }

    public static final double copysign(final double x, final double y) {
        //__HI(x) = (__HI(x)&0x7fffffff)|(__HI(y)&0x80000000);
        // The below is actually about 30% faster than doing greater/less comparisons.
        return Double.longBitsToDouble((Double.doubleToLongBits(x) & 0x7fffffffffffffffL)
                | (Double.doubleToLongBits(y) & 0x8000000000000000L));
    }
}
