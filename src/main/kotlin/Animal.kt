abstract class Animal (
    protected val species: String,
    /**프로퍼티를 override 할 때는 open 키워드를 붙여줘야 한다. - class Penguin*/
    protected open val legCount: Int){
    abstract fun move()
}
