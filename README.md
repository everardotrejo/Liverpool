Proyecto base para iniciar aplicaciones en Android
===========================================================

Este código hace un request a un API de productos

 Permitirle al usuario buscar productos en base a un texto que sea ingresado
 Mostrar un listado de los productos que regrese el servicio
 Tiene una lista de las búsquedas realizadas anteriormente, es decir criterios usados  (deben verse aún después de reiniciar la aplicación y se deben de poder eliminar uno o todos).  

Introduccion
-------------

### Funcionalidad
Esta app realiza consume un api de productos y muestra su resultado, guarda el criterio de busqueda en la base de datos local


### Librerias
* [Android Support Library][support-lib]
* [Android Architecture Components][arch]
* [Android Data Binding][data-binding]
* [Dagger 2][dagger2] for dependency injection
* [Retrofit][retrofit] for REST api communication
* [Glide][glide] for image loading
* [Timber][timber] for logging
* [espresso][espresso] for UI tests
* [mockito][mockito] for mocking in tests


[mockwebserver]: https://github.com/square/okhttp/tree/master/mockwebserver
[support-lib]: https://developer.android.com/topic/libraries/support-library/index.html
[arch]: https://developer.android.com/arch
[data-binding]: https://developer.android.com/topic/libraries/data-binding/index.html
[espresso]: https://google.github.io/android-testing-support-library/docs/espresso/
[dagger2]: https://google.github.io/dagger
[retrofit]: http://square.github.io/retrofit
[glide]: https://github.com/bumptech/glide
[timber]: https://github.com/JakeWharton/timber
[mockito]: http://site.mockito.org

Licencia
--------

Copyright 2021 The Android Open Source Project, Inc.

