Araştırma

Unit Test

Unit test bir koddaki isole olduğunda mantıksal olarak çalışabilecek en küçük kod dizisini çalıştırmanın adından gelen test yöntemidir.
Birim testinin modern versiyonları JUnit gibi freameworks veya TestComplete gibi test araçlarında bulunabilir.

Unit test üç aşamadan oluşur: İlk olarak planlama, sonra test senaryolarının yazılması ve birim testinin kendisinin gerçekleştirilmesi. 
Her test durumu, kodda bağımlılık olmamasını sağlamak için izole bir ortamda bağımsız olarak test edilir.
Yazılım geliştiricisi, her test senaryosunu doğrulamak için kriterleri kodlamalı ve başarısız olan testleri raporlamak için bir test framework kullanmalıdır. 
Geliştiriciler kodun her satırı için test yapmamalıdır çünkü bu çok fazla zaman alabilir.Bunun yerine geliştirilmekte olan yazılımın davranışını etkileyebilecek kodlara odaklanan testler oluşturmalıdır.


Desingn Pattern, yazılım tasarımında belirli bir bağlamda yaygın olarak ortaya çıkan bir soruna yönelik genel, yeniden kullanılabilir bir çözümdür. 
Doğrudan kaynak koduna veya makine koduna dönüştürülebilecek bitmiş bir tasarım değildir. Daha ziyade, birçok farklı durumda kullanılabilecek bir sorunun nasıl çözüleceğine ilişkin bir açıklama veya şablondur. 
Programcının bir uygulama veya sistem tasarlarken sık karşılaşılan sorunları çözmek için kullanabileceği resmileştirilmiş en iyi uygulamalardır.

1)Creational patterns
-- Abstract factory pattern : Somut sınıflarını belirtmeden ilgili veya bağımlı nesnelerin ailelerini oluşturmak için bir arayüz sağlar.
-- Singleton pattern : Bir sınıfın yalnızca bir örneğine sahip olduğundan emin olur ve ona küresel bir erişim noktası sağlar.

2)Structural pattern
-- Composite pattern : Parça-bütün hiyerarşilerini temsil etmek için nesneleri ağaç yapılarında oluştur. Kompozit, müşterilerin tek tek nesnelere ve nesne kompozisyonlarına aynı şekilde davranmasını sağlar.
-- Bridge pattern : Bir soyutlamayı uygulamasından ayırır ve ikisinin bağımsız olarak değişmesine izin verir.

3)Behavioral pattern
-- Iterator pattern : Birleştirilmiş bir nesnenin öğelerine, temel temsilini açığa çıkarmadan sırayla erişmenin bir yolunu sağlar.
-- Template method : Bir işlemdeki algoritmanın iskeletini, bazı adımları alt sınıflara erteleyerek tanımlar ve alt sınıfların, algoritmanın yapısını değiştirmeden bir algoritmanın belirli adımlarını yeniden tanımlamasını sağlar.

4)Concurrency pattern
-- Active object : Yöntem yürütmeyi, kendi kontrol iş parçacığında bulunan yöntem çağrısından ayırır. Amaç, eşzamansız yöntem çağrısı ve istekleri işlemek için bir zamanlayıcı kullanarak eşzamanlılık sağlamaktır.
-- Reactor pattern : Bir reaktör nesnesi, eşzamanlı olarak işlenmesi gereken kaynaklara eşzamansız bir arayüz sağlar.
