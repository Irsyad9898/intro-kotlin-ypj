/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    
    var myAge = 15
    
    //jika dan jika tidak
    if (myAge < 18) {
    	println("You are underage")
    println("The End")
    }
    
    //jika dan lain2
    if(myAge <18) {
    	println("You are underage")
    }
    else {
        println("You can watch the movie")
    }
    
    //if, else if, else (jika, dan jika .... dan lain2)
    
    if(myAge<13){
        println("You cannot watch the movie")
    }
    else if (myAge<18) {
        println("You can watch with parent (PG)")
    }
    else {
        println("you can watch the movie")
    }
    
    
    //bawah 13 tahun xboleh
    //13 -17 tahun kena ada parent
    //18 ke atas boleh
    var childAge = 17
    var parent = true
    
    if (childAge <13){
        println("You cannot watch the movie")
    }
    else if (childAge <18 && parent ==false) {
        println("You cannot watch the movie")
    }
    else if (childAge <18 && parent ==true) {
        println("You can watch the movie")
    }
    else {
        println("You ca watch the movie")
    }
    
    //when (a.k.a switch case in other language)
    //akan dipakai dalam android bila buat button
    
    var size = 1
    var price = 0
    
    when (size) {
        1-> price =5
        2-> price =7
        3-> price =10
        else-> println("We don't support other size") //default
    }
    println(price)
    
  // whenn
 when {
     childAge <13 -> println("you cannot watch movie")
     childAge <18 && parent == false -> println("you cannot watch the movie")
     childAge <18 && parent == true -> println("you can watch the movie")
     else -> println("you can watch the movie")
 }
  
  
  //for loop   // // untuk bekerja dengan index
  println("Menaik")
  for (i in 0..5) {
      println("i=$i")  // dari 0 sehingga 5, keluarkan nilai i
  }
  println("Menurun")
  for (i in 5 downTo 0) {
      println("i=$i")
  }
  println("Menaik tambah 2")
  for (i in 1..5 step 2) {
      println("i=$i") //dari 1 sehingga 5, setiap kali naik 2
  }
  println("menurun tolak dua")  
  for (i in 5 downTo 1 step 2) { // turun guna downTo
      println("i=$i") //dari 1 sehingga 5, setiap kali turun 2
  }   
    
  //for item in array // untuk bekerja dengan collection
  
  var languages = arrayOf("Ruby","Kotlin","Phyton","Java")
  
  for (item in languages){
      println(item)
  }
  
  //languages.size =4
  //dari 0 sehingga 3
  //item start from 0,1,2,3
   
  for (i in 0 ..languages.size - 1){
      println("Item at index $i is ${languages[i]}")
  }
    
  //while
  
  var x1 = 1
  while (x1 <5){
      println("x1 = $x1")
      x1++ //selagi nilai x1 kurang dari 5, keluarkan nilai x1 dan tambah denagn setiap kali
  }
  
  //do while
  //selagi => but do while will ensure that the code inside do to be execute at least 1
  var x2 = 30
    do {
        println("x2 = $x2") //keluarkan nilai x2
        x2++ //dan tambahkan kepada 1
    }
    
    while(x2<=5) // ulang semula selagi x2 kurang sama dengan 5
    
    
    //keluar dari controll flow
  var x3 = 1
    do {
        println("x3=$x3")
        x3++
        if (x3 == 3) break //keluar dari do while
    }
    while (x3<=5)
   
     //continue - abaikan senario ini
   var x4 = 0 
    do {
        x4++
            if (x4==3) {continue}  //abaikan senario ini tapi teruskan
            println("x4=$x4")
        }
    while (x4 <=5)
    
    sayHello() //function invokation/panggil function
    
    sayGoodbye("wan")
    sayGoodbye("farah")
    
    println(calculateBMI(170.0,80.0))
}

//function is a group expression that can reusable in our code
fun sayHello() {
    println("Hello World") // declaration a function sayHello, this function will just print "hello world"
}

//function with argument/parameter
fun sayGoodbye(name:String){
    println("Goodbye $name")
}

//function with return
fun sum(a:Int, b:Int):Int{
    return a +b
}
fun calculateBMI(height:Double, weight:Double): Double{ //formula yang dipulangkan adalah double
    return weight / ((height/100)*(height/100)) //akan memukangkan fuction ini
}
