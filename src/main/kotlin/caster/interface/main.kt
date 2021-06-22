package caster.`interface`

fun main() {
    val button = Button()
    button.clickListener = object: OnClickListener {
        override fun onClick() {
            println("Button clicked")
        }

    }
    button.click()

    val image = Image()
    image.setMyListner(object: OnClickListener{
        override fun onClick() {
            println("Image clicked")
        }
    })
    image.click()
}



interface OnClickListener{
    fun onClick()
}

abstract class View{
    lateinit var clickListener: OnClickListener

    fun setMyListner(clickListener: OnClickListener){
        this.clickListener = clickListener
    }

    fun click(){
        clickListener.onClick()
    }
}

class Button : View()
class Image : View()
class Map : View()