## Java Spring Boot Bootcamp | [kodlama.io](https://www.kodlama.io)

> **_Lectures and Homeworks_**

![](https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/qUyYtyzXTrOSH2M2ApBh)

---

# Class

<details>
  <summary>Click for more... </summary><br>
  Java nesne yönelimli (OOP) bir programlama dilidir.
  Java'da her şey, nitelikleri, özellikleri veya durumlarıyla sınıflar(class) ve nesnelerle ilgilidir.

**Class(Sınıf) nedir ?**
Sınıf (class) soyut bir veri tipidir. Nesne (object) onun somutlaşan bir cismidir.
Kendisinden üretilecek nesneler için bir model görevi görür. Bu soyut varlık ile bu varlığa ait olan nesneler türetilir.

**Nesne nedir?**
Sınıftan oluşturulan varlıkları ifade eder. Örneğin Ülke sınıfımız olmuş olsun bu ülke sınıfımızın nesnesi olarak istanbul adında bir nesne oluşturalım işte buradaki Ülke sınıfından oluşturulan istanbul bizim nesnemiz oluyor. Yine aynı Ülke sınıfı kullanılarak Ankara, Edirne vb. nesneler de oluşturulabilir.

```java
 public class Ulke {
	int plakaNo;
	String isim;
	int nüfus;
 }
```

```java
 public static void main(String[] args) {
		Ulke istanbul = new Ulke();
		istanbul.plakaNo = 34;
		istanbul.isim = "İstanbul";
		istanbul.nüfus = 16034500;
	}
```

gibi basit bir kod örneğiyle de göstermiş oldum artık elimizde istanbul adıyla İstanbul ilinin verilerini, özelliklerini tutacak olan bir nesnemizi oluşturmuş olduk.

![Object](https://user-images.githubusercontent.com/49093196/116869519-8d512f80-ac19-11eb-8cf3-c753511edded.png)

En temel class (sınıf) object sınıfıdır diğer bütün sınıfların atası olarak düşünebiliriz

</details>

- [classes](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/classes/src)
- [static & inner class](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/staticDemo/src/staticDemo)
<hr>

# OOP introduction

<details>
  <summary>Click for more...</summary><br>
  
  **Object Oriented Programming (OOP)/ Nesne Yönelimli Proramlama nedir?**

Java'daki OOP kavramları, Java'nın Nesne Yönelimli Programlamasının arkasındaki ana fikirlerdir. Bunlar bir soyutlama, kapsülleme, kalıtım ve çok biçimliliktir. Bunları kavramak, Java'nın nasıl çalıştığını anlamanın anahtarıdır. Temel olarak, Java OOP kavramları çalışma yöntemleri ve değişkenleri oluşturmamıza, ardından güvenlikten ödün vermeden hepsini veya bir kısmını yeniden kullanmamıza izin verir.

  <hr>
   
   **OOP Kavram Listesi**
  Java'da 4 ana OOP kavramı vardır. Bunlar:
  
  **Abstract (Soyutlama):** Soyutlama, karmaşıklığı temsil etmek için basit şeyler kullanmak anlamına gelir. Java'da soyutlama, nesneler, sınıflar ve değişkenler gibi basit şeylerin daha karmaşık temel kod ve verileri temsil ettiği anlamına gelir. Bu önemlidir, çünkü aynı işi birden çok kez yinelemekten kaçınır.

**Encapsulation (kapsülleme):** Bir sınıf içindeki alanları özel tutma, daha sonra ortak yöntemlerle bunlara erişim sağlama uygulamasıdır. Bu, verileri ve kodu sınıfın içinde güvende tutan koruyucu bir bariyerdir. Bu şekilde, veri sistemi genelinde açık erişime izin vermeden kod bileşenleri veya değişkenler gibi nesneleri yeniden kullanabiliriz.

**Inheritance (miras):** Java'da Nesne Yönelimli Programlama'nın özel bir özelliğidir. Programcıların varolan sınıfların bazı özniteliklerini paylaşan yeni sınıflar oluşturmasına olanak tanır. Bu, bize miras aldığımız sınıfın özelliklerine erişmemizi sağlar.

**Polimorphism (Çok biçimlilik):** Java OOP konsepti, programcıların farklı durumlarda farklı şeyler ifade etmek için aynı ismi (aynı isimde metot olabilir) kullanmalarını sağlar. Java'da polimorfizmin bir şekli yöntem aşırı yüklemedir.Yani varolan bir methodu kullanılan bir sınıf için fakrlı anlam ifade ediyorsa kendi ifade şekline göre oluşturulur. Bu, farklı anlamların sağlanan değişkenlerin değerleri tarafından yönetilir.

</details>

- [OOP intro](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/oopIntro/src/oopIntro)
- [Fields and Attributes](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/fieldsAndAttribute/src/classesWithAttributes)
- [Value and Reference Types](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/classes/src/classes/valueAndReferenceTypes)
<hr>

# Inheritance

<details>
  <summary>Click for more...</summary><br>
  
  **Inheritance (miras) nedir?** 
    Bir sınıfın kendisine ait özellikleri ve işlevleri bir başka sınıfa aynen aktarması ya da bazı özellik ve işlevlerini diğer sınıfların kullanmasına izin vermesi şeklinde oluşmaktadır.
   Üst sınıf (Süper sınıf) özelliklerini alt sınıflarda kullanmak için extends deyimi ile kullanılırız. peki extends ne demek?

Extends: Herhangi bir sınıfın özelliklerini ve işlevlerini miras olarak alması için kullanılan deyimdir. Yani özellik genişletmek anlamında düşünebiliriz.

**Neden inheritance peki?**

    - Daha önce yazılmış sınıf içindeki kod parçacıklarının tekrar tekrar yazılmadan başka sınıflar içinde kullanılması sağlar. Bu işlem iş yükünü hafifletir ve zaman kazandırır.

    - Projelerde daha önce kullanılan sınıflar, denenmiş hatasız anlamındadır. Kısaca daha çok güven arz etmektedir.

    - if, else, switch gibi kontrol ifadelerinin kullanıldığı sınıflar kötü tasarım örnekleri olarak ele alındıklarından (spaghetti kod, bir Engin Demiroğ deyimidir. :)), kalıtımın nimetlerinden faydalanabiliriz.

  <hr>

</details>

- [Basic inheritance example](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/inheritance/src/inheritance)
- [Inheritance and method override](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/oop/inheritance/src/inheritance2)
<hr>

# Polymorphism

<details>
  <summary>Click for more...</summary><br>
  
  **Polimorphism (çok biçimlilik) nedir?** 
   Polymorphism(polimorfizm), bir varlık ya da nesnenin birden fazla forma sahip olması olarak adlandırılır. Yani oluşturduğumuz bir nesne kendisi gibi değil de başka bir nesne gibi davranıyorsa buna polymorphism yani çok biçimlilik diyoruz. Kalıtım konusu ile ilişkili bir kavramdır.

**Polimorphism ne işimize yarar peki?**

    - Bildiğiniz gibi, kalıtım konusundan itibaren kodları yeniden kullanmak yerine kodu geliştirerek verimi artırmaya ve fazla kodlardan kurtulmaya çalıştık. Polymorphism de kalıtıma bağlı programlama unsuru olduğu için onunla benzer görevleri görür. Kelimede yer alan poly ifadesi “birden çok” anlamına gelir. Morph ise “şekil, görüntü” anlamında kullanılır. Bu açıdan bakıldığında da birden fazla görüntü anlamını çıkarabiliriz ki bu çıkarım da bize polymorphism’in amacını açıklar nitelikte olmuş olur.

**nasıl işler bir örnekle inceleyelim**
Öncelikle bir kamp ortamı oluşturalım ;

```java
public class JavaReactCamp {

	public void kampaKatil() {
		System.out.println("Kampa katildiniz");
	}

	public void kampiBitir() {
		System.out.println("Kamp bitti");
	}

}

```

sınıf isimlerim anlamsız olsada: :) eski ve yeni oğrenci olmak üzere iki sınıf oluşturalım

```java
public class EskiOgrenci extends JavaReactCamp {

	public void kampaKatil() {
		System.out.println("Eski Ogrenci kampa katildi");
	}
}

```

```java
public class YeniOgrenci extends JavaReactCamp{

	public void kampaKatil() {
		System.out.println("Yeni ogrenci kampa katildi");
	}
}
```

Ve olayın gerçekleşeceği ve kavraacağımız bir sınıf oluşturup uygulayalım

```java
public class Polimorphism {

	public static void kampaKatil(JavaReactCamp kamp) {
		// buradaki static kavramı static metotlar static olanların
		// içinde çağrılabildiği (kullanılabildiği) için kullandım yani
		// mainde instance oluşturmak yerine Sınıf ismiyle çağırmak için
		// tavsiye edilmeyen bir yöntemdir bu ama kodlar açık olsun diye
		// bu yöntemi kullandım.
		kamp.kampaKatil();
	}
}

```

ve son olarak main de polimorfik yapıyı görebileceğiz

```java
public class Main {

	public static void main(String[] args) {
		JavaReactCamp javaReactCamp = new JavaReactCamp();
		EskiOgrenci eskiOgrenci = new EskiOgrenci();
		YeniOgrenci yeniOgrenci = new YeniOgrenci();

		Polimorphism.kampaKatil(eskiOgrenci);
		Polimorphism.kampaKatil(yeniOgrenci);
		Polimorphism.kampaKatil(javaReactCamp);

	}
}
```

program çıktısı ektedir:

```java
Eski Ogrenci kampa katildi
Yeni ogrenci kampa katildi
Kampa katildiniz

```

  <hr>

</details>

<hr>

# Abstraction

<details>
  <summary>Click for more...</summary><br>
  
  **Abstraction (soyutlama) nedir?** 
   Abstract sınıflar,genellikle ortak özellikleri olan nesneleri tek bir çatı altında toplamak için kullanılır. Abstract sınıflarda içi boş yada dolu metodlar tanımlanır. Abstract sınıflardan new kelimesi ile nesne oluşturulmaz. En az 1 abstract metod varsa sınıf abstract olmalıdır. Bir sınıfı abstract sınıf yapmak için abstract kelimesi kullanılır

**Hangi durumlarda kullanılmalı :**

- Bir biriyle ilişkisi olan sınıflar arasında kod paylaşımı yapmak istediğimizde

- Nesnelerin oluşturulfugu sınıflardaki, static ve final türünde olmayan sınıf değişkenlerini manipüle ederek o sınıftan oluşturulan nesnelerin davranışlarını değiştirilmeyi sağlayan metodlar tanımlamak istediğimizde

- Soyut sınıftan miras alınan sınıfların bir çok ortak değişkeni veya metot içerebileceğini ve public erişim belirtecine sahip olmayan (private veya protected) metot veya değişkenler içerebileceğini öngördüğünüzde kullanabiliriz.

  <hr>

</details>

<hr>
  
# Interface

<details>
  <summary>Click for more...</summary><br>
  
  **Interface (arayüz) nedir?**

- Interface normal bir class gibi tip(type) tanımlamak için kullanılır. İçerisindeki default ve static tanımlanan metotlar hariç, metotların implementasyonları bulunmaz ve state tutmaz.
  Bir çok class tarafından implement edilebilirlen yapılardır. Birden fazla interface’i extends edebilirler. Ve interfaceler ayrıcı çok iyi birer referans tutuculardır.

**Hangi durumlarda kullanılmalı**

- Birden fazla sınıftan davranışları miras almak istediğimizde kullanabiliriz.

* Sistem için belirli bir davranış belirlediğimiz durumlarda ama o davranışın ne gibi durumlarda elde edildiğini bir önemi olmadığı durumlarda

* Bir biriyle yakın ilişkisi olmayan / olmadığı halde arayüzünü geliştirecek sınıflar oluşturulmak istenildiğinde

</details>

<hr>
  
# Lectures

- [Lecture 1](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/Lesson1)
- [Lecture 2](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampLessons/Lesson2_OOP/src)

<hr>
  
# Homeworks

  - Week3
  
	- [Homework1](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampHomeworks/week3_homework/src/week3_homework)
	- [Homework2](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampHomeworks/week3_homework/src/week3_homework2)

- Week4	
	- [Homework1](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/tree/master/JavaBootcampHomeworks/week4_homework/homework)
<hr>
  
# Licence

[MIT](https://github.com/OzerBey/JavaBootcampWorks_kodlamaio/blob/master/LICENCE.txt)
