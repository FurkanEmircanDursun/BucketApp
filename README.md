# MyBucketApp

MyBucketApp, Retrofit ve Glide kullanarak yapılan bir örnek uygulamadır. Bu uygulama, çeşitli API'larla etkileşime geçerek ürünleri listeleyebilir, ürün detaylarını görüntüleyebilir, sepete ürün ekleyebilir ve sepet içeriğini görüntüleyebilir.

## Kullanılan Kütüphaneler

- Glide: `implementation 'com.github.bumptech.glide:glide:4.15.1'`
- Retrofit: 
  - Core: `implementation group: 'com.squareup.retrofit2', name: 'retrofit', version: '2.9.0'`
  - Gson Converter: `implementation group: 'com.squareup.retrofit2', name: 'converter-gson', version: '2.9.0'`

## API'lar

- Ürünleri Listeleme: `GET https://dummyjson.com/products`
- Ürün Detayı: `GET https://dummyjson.com/products/{id}`
- Sepete Ekleme: `POST https://dummyjson.com/carts/add`
- Sepeti Görüntüleme: `GET https://dummyjson.com/carts/1`

## Ekran Görüntüsü

![Ekran Görüntüsü](https://github.com/FurkanEmircanDursun/furkan_emircan_dursun_vize2/assets/63562726/750f2176-57b7-40ea-b206-457868f07264)
