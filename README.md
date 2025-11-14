<p><strong>*** POR LO GENERAL LOS ARCHIVOS SALEN EN EL IDE, PERO SINO SE PUEDE ACCEDER A ELLOS EN LA CARPETA DEL PROYECTO ***</strong></p>

<p>Las dependencias se añaden en el archivo build.gradle.kt (:app) (Nombre_Proyecto\build.gradle.kt) dentro de la etiqueta de dependencies y luego sincronizar el proyecto</p>
<p></p>(suele aparecer una notificación en la parte superior al guardar el archivo)</p>
<img width="827" height="203" alt="image" src="https://github.com/user-attachments/assets/2079fa75-4110-4ae8-abb5-7cbba3fb8a04" />

<h3>VERSIÓN DE KOTLIN</h3>
<p>En el archivo libs.version.toml (Nombre_Proyecto\gradle\) tenemos que la versión de kotlin sea 2.2.21</p>
<img width="330" height="298" alt="image" src="https://github.com/user-attachments/assets/25bd4811-2e16-46b0-b321-17b596894dd5" />

<h3>IMPORTAR ICONOS DE MATERIAL3</h3>
<p>En el archivo build.gradle.kt (:app) (Nombre_Proyecto\build.gradle.kt) dentro de la etiqueta de dependencies</p>
    <p><code>implementation("androidx.compose.material:material-icons-extended:1.7.8")</code></p>

<h3>IMPORTAR IMÁGENES DE INTERNET</h3>
<p>En el archivo build.gradle.kt (:app) (Nombre_Proyecto\build.gradle.kt) dentro de la etiqueta de dependencies</p>
    <p><code>implementation("io.coil-kt.coil3:coil-compose:3.3.0")</code></p>
    <p><code>implementation("io.coil-kt.coil3:coil-network-okhttp:3.3.0")</code></p>

<p>Después implementar/sincronizar hay que añadir el permiso para acceder a internet en el AndroidManifest.xml (Nombre_proyecto\app\src\main\AndroidManifest.xml)</p>
    <p><code>android:name="android.permission.INTERNET"</code></p>
    
<img width="846" height="173" alt="image" src="https://github.com/user-attachments/assets/e5428967-c550-45fb-b7b6-e9e1c8dda8a5" />
<p>(aunque la segunda vez no me ha funcionado......)</p>

<h3>SERIALIZAR</h3>
<p><i>(los pasos de este apartado pueden variar, estar el en orden incorrecto o no necesitar para nada un orden, no lo sé.....)</i></p>
<p>En el archivo build.gradle.kt (:app) (Nombre_Proyecto\build.gradle.kt) dentro de la etiqueta de dependencies</p>
    <p><code>implementation("androidx.navigation3:navigation3-runtime:1.0.0-beta01")</code></p>
    <p><code>implementation("androidx.navigation3:navigation3-ui:1.0.0-beta01")</code></p>
    
<p>En el archivo libs.version.toml (Nombre_Proyecto\gradle\) tenemos que implementar el plugin</p>
  <p><code>jetbrains-kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlinSerialization"}</code></p>
<img width="1236" height="184" alt="image" src="https://github.com/user-attachments/assets/4cf5a1b3-95fd-4489-90e0-9df39a6c1b21" />

<p>Confirmamos que la version de kotlinSerialization sea 2.2.21</p>
<img width="349" height="338" alt="image" src="https://github.com/user-attachments/assets/1350e240-7186-4bb4-af75-c88ea1661c92" />

<p>Y en el archivo build.gradle.kt (:app) (Nombre_Proyecto\build.gradle.kt) añadimos el plugin</p>
<p><code>alias(libs.plugins.jetbrains.kotlin.serialization)</code></p>
<img width="570" height="207" alt="image" src="https://github.com/user-attachments/assets/59b2087d-9115-4d28-bfe7-0b1b43c28f20" />

