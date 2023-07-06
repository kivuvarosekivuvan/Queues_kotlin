fun main() {
var result=Queue(6)
    result.enqueue(3)
    result.enqueue(4)
    result.enqueue(7)
    result.enqueue(6)
    result.dequeue()
    result.display()





}
class Queue(var capacity: Int){
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enqueue(item:Int){
       if (isFull())  {
           println("Queue is full")
        return
    }
        data[rear] = item
        rear++
    }


    fun dequeue():Int?{
if(isEmpty()){
    println("Queue is empty")
    return null
}
        var removed=data[front]
        for(i in front<until <rear -1){

        }
    }


    fun isFull():Boolean{
return rear
    }


    fun isEmpty():Boolean{
return front==rear
    }
    fun display(){
        if(isEmpty()){
            println("Queue is empty")
            return
        }


    }

}



















