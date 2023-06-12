# MyBucketApp

MyBucketApp is a sample application built using Retrofit and Glide. This application interacts with various APIs to list products, view product details, add products to the cart, and view cart contents.

## Used Libraries

- Glide: `implementation 'com.github.bumptech.glide:glide:4.15.1'`
- Retrofit:
  - Core: `implementation group: 'com.squareup.retrofit2', name: 'retrofit', version: '2.9.0'`
  - Gson Converter: `implementation group: 'com.squareup.retrofit2', name: 'converter-gson', version: '2.9.0'`

## APIs

- List Products: `GET https://dummyjson.com/products`
- Product Details: `GET https://dummyjson.com/products/{id}`
- Add to Cart: `POST https://dummyjson.com/carts/add`
- View Cart: `GET https://dummyjson.com/carts/1`

## Screenshots

![Screenshot](https://github.com/FurkanEmircanDursun/furkan_emircan_dursun_vize2/assets/63562726/750f2176-57b7-40ea-b206-457868f07264)
