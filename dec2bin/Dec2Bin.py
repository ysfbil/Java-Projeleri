
print("10'luk Sistemden 2'lik Sisteme Çeviren Program")
print("çıkmak için e yazınız")

def dec2bin():
    sayi0=input("Sayıyı giriniz: ")
    if (sayi0=='e'):
        return 0

        
    sayi=int(sayi0)
    cikti=''
    i=0

    if (sayi<0):
        i=1
        sayi=-1*sayi
        

    while (sayi!=0):
        kalan=sayi%2;
        sayi=int(sayi/2)
        cikti=str(kalan)+cikti
    u=len(cikti)
    for c in range(16-u):
        cikti='0'+cikti


    if i==1:
        if u<32:
            isaretli='1'+cikti[1:]
        else:
            isaretli=''
            print('over flow')
                   
        #tumleyen
        sayi1=cikti
        tum=''
        tum2=''
        ilk=False
        ind=0
     
        for s in sayi1:
            b='0' if s=='1' else '1'
            tum+=b
            t=sayi1[16-ind-1]
            
            if not ilk:            
                tum2=t+tum2
                
                if t=='1':
                    ilk=True
            else:
               c='0' if t=='1' else '1'
               tum2=c+tum2
              
            
            ind+=1


       


    if i==0:
        print(sayi0, "sayısının 2'lik Sistemde Karşılığı : ",cikti);
    else:
        print(sayi0,' sayısının işaretli karşılığı    : ',isaretli)
        print(sayi0,' sayısının 1e tümleyen karşılığı : ',tum)
        print(sayi0,' sayısının 2e tümleyen karşılığı : ',tum2)
        
        '''
        tum1=int(tum,2)
        print(bin(tum1)[2:],'1e tumleyen')
        tum_2=tum1+1
        print(bin(tum_2)[2:],'2e tumleyen')
        '''
       

while dec2bin()!=0:
    print()
    
    

