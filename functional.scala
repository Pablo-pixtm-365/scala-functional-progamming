// define our first class
class Inicio{
  
  private val guisos: Int = 9
  private val bebidas: Int = 7
  
 // we do the functions that show the stews, drink and the price 
 // here we use a little of functional programming
def menu(){
    val ingredientes = List("tinga de res", "tinga de pollo", "papa", "picadillo", "rajas", "nopal", "hongos", "asado", "asado", "chicharron")
    println("\tThere are available " + guisos + " different stews: ")
    ingredientes.foreach{ x => println(s"-${x}")}
  }
def menu1(){
    val bebidas2 = List("coca","sprit","té","pepsi","sangría","mirinda","manzanita")
    println(" \tThere are available " + bebidas + " different drinks: ")
    bebidas2.foreach{x => println(s"-${x}")}
  }
def prices(){
  val prices2 = List("sopes:$14", "huaraches:$26", "quesadillas al comal o fritas:$20", "pambazos:$21", "flautas:$30", "tortas:$25", "all drinks:$23")
  println("\tprices:")
  prices2.foreach{x => println(s"-${x}")}
}
// in this function you register your name to see the product
def cliente(){

  println("\nWhat is your name:")
  var name = scala.io.StdIn.readLine(); // read a value of the keyboard
  println("\nWelcome to the sales record of the current year " +  name)
}
}

// crea a new object and call the previous methods
var x = new Inicio()
x.menu()
x.menu1()
x.prices()
x.cliente()

// define the second class the has the interaction about the different products sold during the months
class pedido{

  def interaction(){

    var cerrar = "p"
    while(cerrar!="y"){

      // instruccions for show the differents sold products
      println("Enter the number of the month to see the sales of each product:")
      println("if you want to exit enter 'y' ")
      cerrar = scala.io.StdIn.readLine(); // read a value of the keyboard

         // the months of the year
      if(cerrar == "1"){
        println("January:")
        var venta1 = List("sopes:44", "huaraches:46", "quesadillas al comal:100", "pambazos:40", "flautas:30", "tortas:55", "drinks:100")
        venta1.map{x => println("\n" + x )}
      }
      if(cerrar=="2"){
        println("February:")
        var venta2 = List("sopes:100", "huaraches:41", "quesadillas al comal:60", "pambazos:65", "flautas:15", "tortas:70", "drinks:90")
        venta2.map{x => println("\n" + x )}
      }
      if(cerrar=="3"){
        println("March:")
        var venta3 = List("sopes:200", "huaraches:150", "quesadillas al comal:140", "pambazos:50", "flautas:70", "tortas:55", "drinks:200")
        venta3.map{x => println("\n" + x )}
      }
      if(cerrar=="4"){
        println("April:")
        var venta4 = List("sopes:122", "huaraches:88", "quesadillas al comal:100", "pambazos:60", "flautas:88", "tortas:45", "drinks:150")
        venta4.map{x => println("\n" + x )}
      }
      if(cerrar=="5"){
        println("May:")
        var venta5 = List("sopes:66", "huaraches:235", "quesadillas al comal:142", "pambazos:50", "flautas:70", "tortas:55", "drinks:200")
        venta5.map{x => println("\n" + x )}
      }
      if(cerrar=="6"){
        println("June:")
        var venta6 = List("sopes:155", "huaraches:245", "quesadillas al comal:215", "pambazos:50", "flautas:70", "tortas:55", "drinks:147")
        venta6.map{x => println("\n" + x )}
      }
      if(cerrar=="7"){
        println("july")
        var venta7 = List("sopes:201", "huaraches:210", "quesadillas al comal:216", "pambazos:177", "flautas:50", "tortas:145", "drinks:300")
        venta7.map{x => println("\n" + x )}
      
      }
      if(cerrar=="8"){
        println("Agost")
        var venta8 = List("sopes:300", "huaraches:168", "quesadillas al comal:148", "pambazos:164", "flautas:92", "tortas:55", "drinks:250")
        venta8.map{x => println("\n" + x )}
      }
      if(cerrar=="9"){
        println("September")
        var venta9 = List("sopes:74", "huaraches:41", "quesadillas al comal:350", "pambazos:178", "flautas:120", "tortas:125", "drinks:100")
        venta9.map{x => println("\n" + x )}
      }
      if(cerrar=="10"){
        println("October")
        var venta10 = List("sopes:200", "huaraches:100", "quesadillas al comal:471", "pambazos:50", "flautas:70", "tortas:152", "drinks:369")
        venta10.map{x => println("\n" + x )}
      }
      if(cerrar=="11"){
        println("November")
        var venta11 = List("sopes:150", "huaraches:168", "quesadillas al comal:197", "pambazos:99", "flautas:75", "tortas:75", "drinks:190")
        venta11.map{x => println("\n" + x )}
      }
      if(cerrar=="12"){
        println("December")
        var venta12 = List("sopes:220", "huaraches:188", "quesadillas al comal:712", "pambazos:120", "flautas:97", "tortas:154", "drinks:350")
        venta12.map{x => println("\n" + x )}
      }
      

    }



  }


}

// create a new object and call the  function interaction
var y = new pedido()
y.interaction();
