package com.example.helloworldapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Declare UI variables to be used across the app using the keyword lateinit
    //Declare Buttons
    lateinit var SHORTBLACKESPRESSO:Button
    lateinit var DOUBLEESPRESSO:Button
    lateinit var MACCHIATO:Button
    lateinit var RISTRETTO:Button
    lateinit var AMERICANO:Button
    lateinit var LATTE:Button
    lateinit var CAPPUCCINO:Button
    lateinit var FLATWHITE:Button
    lateinit var clear:Button
    //Declare TextViews
    lateinit var viewRecipe:TextView
    lateinit var selectTextView:TextView
    //Declare LinearLayout
    lateinit var linerLayoutRecipe:LinearLayout
    //Declare ScrollView
    lateinit var coffeScrollView:ScrollView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize UI variables
        //Initialize Buttons
        SHORTBLACKESPRESSO=findViewById(R.id.SHORTBLACKESPRESSO)
        DOUBLEESPRESSO=findViewById(R.id.DOUBLEESPRESSO)
        MACCHIATO=findViewById(R.id.MACCHIATO)
        RISTRETTO=findViewById(R.id.RISTRETTO)
        AMERICANO=findViewById(R.id.AMERICANO)
        LATTE=findViewById(R.id.LATTE)
        CAPPUCCINO=findViewById(R.id.CAPPUCCINO)
        FLATWHITE=findViewById(R.id.FLATWHITE)

        clear=findViewById(R.id.clear)
        //Initialize TextView
        viewRecipe=findViewById(R.id.viewRecipe)
        selectTextView=findViewById(R.id.selectTextView)
        //Initialize ScrollView
        coffeScrollView=findViewById(R.id.coffeScrolView)
        //Initialize linerLayout
        linerLayoutRecipe=findViewById(R.id.linerLayoutRecipe)

        //SetOnClickListener for Buttons
        SHORTBLACKESPRESSO.setOnClickListener { getCoffeRecipe(SHORTBLACKESPRESSO.text.toString()) }
        DOUBLEESPRESSO.setOnClickListener { getCoffeRecipe(DOUBLEESPRESSO.text.toString()) }
        MACCHIATO.setOnClickListener { getCoffeRecipe(MACCHIATO.text.toString()) }
        RISTRETTO.setOnClickListener { getCoffeRecipe(RISTRETTO.text.toString()) }
        AMERICANO.setOnClickListener { getCoffeRecipe(AMERICANO.text.toString()) }
        LATTE.setOnClickListener { getCoffeRecipe(LATTE.text.toString()) }
        CAPPUCCINO.setOnClickListener { getCoffeRecipe(CAPPUCCINO.text.toString()) }
        FLATWHITE.setOnClickListener { getCoffeRecipe(FLATWHITE.text.toString()) }

        clear.setOnClickListener { clearRecipeText() }

    }
    //Hide coffee recipe textview
    fun clearRecipeText(){
        viewRecipe.text=""
        linerLayoutRecipe.setVisibility(View.GONE)
        coffeScrollView.setVisibility(View.VISIBLE)
        selectTextView.setVisibility(View.VISIBLE)
    }
    //Show coffee recipe textview
    fun getCoffeRecipe(coffee:String){

        when{

            coffee=="SHORT BLACK ESPRESSO"->{viewRecipe.text="Short black espresso is the 25-30 ml extraction of coffee beans ground for the espresso machine with pour time of 15-30 seconds. The short black espresso is the foundation part to every espresso based coffee drink. Short black is traditionally served in a preheated small ceramic cup."}
            coffee=="DOPPIO (DOUBLE ESPRESSO)"->{viewRecipe.text="Double espresso or Doppio is a strong coffee simply consisting of two short blank espresso is the 2 oz or 60 ml extraction of coffee filter. A double shot of espresso served in a demitasse or ceramic cup which is preheated. It is often referred to as a standard double."}
            coffee=="MACCHIATO"->{viewRecipe.text="Macchiato coffee is usually 1 shot of espresso topped off with milk foam. It consist of three different colored layers.\n" +
                    "\n" +
                    "- Bottom dark layer to represent the 1 shot of espresso.\n" +
                    "\n" +
                    "- Middle layer that mixes the espresso and the milk or dollop of steamed milk.\n" +
                    "\n" +
                    "- Top layer of the steamed milk foam. The milk foam helps to soften the bitter espresso taste."}
            coffee=="RISTRETTO"->{viewRecipe.text="A Ristretto Espresso made with the same amount of coffee but half the amount of water. It is usually very strong coffee.\n" +
                    "\n" +
                    "- 1/2 or half the amount of standard espresso shot.\n" +
                    "\n" +
                    "- 1/2 or half the amount of water."}
            coffee=="AMERICANO (LONG BLACK)"->{viewRecipe.text="Americano or Long Black is very simply an espresso shot topped up with hot water or just a filtered coffee.\n" +
                    "\n" +
                    "- Simply boil water around 200 ml or 6 oz or 2/3 cup and pour in a cup or mug.\n" +
                    "\n" +
                    "- Extract 1 shot of espresso around 75 ml or 2 oz (more if you like it stronger) over the hot water."}
            coffee=="CAFÉ LATTE"->{viewRecipe.text="Café latte or “Latte” for short, is an espresso based drink with steamed milk in a 1:3 to 1:5 ratio with a little micro-foam added to the coffee.\n" +
                    "\n" +
                    "- Extract 1 shot of espresso around 2 oz or 75 ml into a cup or tumbler.\n" +
                    "\n" +
                    "- Add steamed milk and pour on top around 5 oz or 150 ml.\n" +
                    "\n" +
                    "- Putting some micro-foam around 1 cm on top of the steamed milk."}
            coffee=="CAPPUCCINO"->{viewRecipe.text="Cappuccino Espresso is similar to a Café Latte and made with hot milk and steamed milk foam. Main difference is that a cappuccino served in a cup instead of a glass tumbler with more foam and sprinkle chocolate on top of the drink.\n" +
                    "\n" +
                    "- Extract 1 shot of espresso around 2 oz or 75 ml into a cup.\n" +
                    "\n" +
                    "- Add steamed milk (5 oz or 150 ml).\n" +
                    "\n" +
                    "- Add micro-foam around 2-3 cm on top of the steamed milk.\n" +
                    "\n" +
                    "- Place sprinkle chocolate powder on top of the coffee."}
            coffee=="FLAT WHITE"->{viewRecipe.text="A flat white an espresso made similar to a latte or cappuccino expect it does not have any micro-foam or chocolate on top drink, it contains only with textured milk.\n" +
                    "\n" +
                    "- Extract 1 shot of espresso around 2 oz or 75 ml into a cup.\n" +
                    "\n" +
                    "- Add steamed milk and with less or no micro-foam."}
        }
        coffeScrollView.setVisibility(View.GONE)
        selectTextView.setVisibility(View.GONE)
        linerLayoutRecipe.setVisibility(View.VISIBLE)

    }
}