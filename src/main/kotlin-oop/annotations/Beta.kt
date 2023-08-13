package annotations
// class \ Beta

/*
* ANNOTATION TARGET
* -  Contoh untuk merubah location Annotationnya
* - Biasanya di gunakan untuk memakai framework java dengan menggunakan bahasa KOTLIN
* */

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented

annotation class Beta()

class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)