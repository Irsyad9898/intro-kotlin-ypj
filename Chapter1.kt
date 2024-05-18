/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello, Android ATC!!!")
    val x = 2
    val y = 3
    
    println(x)
    val z = x+y
    println(z)
    
    val name = "Irsyad"
    //name = "Muhammad Irsyad"
    println(name)
    
    var fullName = "Muhammad Irsyad"
    fullName = "Irsyad Sahaimi"
    println(fullName)
    
    // : (of type)
    val address:String = "Sungai Besi"
    println(address)
    
    val gender:Char = 'L'
    println(gender)
    
    //operasi +
    
    val massage = "My Name is " + name + "  I live in " +address
    println(massage)
    
    //string interpolation
    //$ -> akan cari variable yg ditetapkan name
    
    val anotherMassage = "My Name is $name and I live in $address"
    println(anotherMassage)
    
    var num1:Double = 9.0
    var num2:Int = 5
    
    var sum= num1+num2
    println(sum)
    
    //operasi + , - , * , / , %
    
    var minus = num1-num2
    println(minus)
    
    var product = num1*num2
    println(product)
    
    var devision = num1/num2
    println(devision)
    
    var modulo = num1%num2
    println(modulo)
    
    var eaten = true
    var tired:Boolean = false
    
    //Boolean operation : &&(and), ||(or), !(reverse)
    println(eaten && tired) // kedua2 perlu true untuk true
    println(eaten || tired) // salah satu perlu true untuk true
    println(!eaten) //reverse kalau true, akan return false, kalau false jadi true !
    
    var profession = null //tiada value
    
    //cara terbaik
    var newProfession:String? = null //question(?) means it can be null or it can be a value
    println(newProfession)
    println(profession)
    newProfession = "Trainer"
    println(newProfession)
    
    var tinggi:Double = 170.0
    var berat = 70
    var bmi = berat / ((tinggi / 100) * (tinggi /100)) //(point) / Int
    println(bmi)
    
    //array
    var scores = arrayOf(70,90,100,80,85,60)
    println(scores[0]) // to retriev the first item in the array
    println(scores[1]) 
    println(scores.size) //how many item inn the array
      
    
}
