# Blocking Queue 



#### Uygulama Hakkinda Bilgiler

- Uygulama tek yönlü bağlı bir listedir.
- Stack'in tersi yönünde çalışmaktadır. FİFO (First in first out) mantığı ile.
- İçerisinde yer alan liste fonksiyonları
  - Add - ekleme yapmak için kullanılır
  - Peek - en üstteki elemanı göstermek için kullanılır
  - Pool - listeden eleman çıkartmak için kullanılır
- Threadler senkronize olacak şekilde ayarlandı. Bir thread işini bitirmeden diğeri onun işini kesemiyor.
- Kullanmak için mainde  thread oluşturulup start ve join edilmesi yeterlidir.