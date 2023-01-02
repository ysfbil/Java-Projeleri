import numpy as np
sayi=input("Bir sayı giriniz : ")
x=np.uint8(int(sayi)) #sayı
y=~x #1e tümleyeni
t=y+1 #2e tümleyeni

#başına formatı güzelleştirmek için 0 ekliyoruz
z=bin(x)[2:]
for i in range(8-len(z)): z='0'+z
z='0b'+z

print('İkili sayı    : ',z)
print('1e tümleyeni : ',bin(y))
print('2e tümleyeni : ',bin(t))
input()
