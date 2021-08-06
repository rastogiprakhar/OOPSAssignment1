package com.prakhar.scala

import scala.collection.mutable.ListBuffer
import scala.io.StdIn


class DoubleQueue extends Queue {

  var queue = new ListBuffer[Int]

  override def enqueue(item: Int): Unit = {
    val doubleItem = item * 2
    queue += doubleItem
  }

  override def dequeue(): Int = {
    queue.remove(0)
  }
}

class SquareQueue extends Queue {
  var queue = new ListBuffer[Int]

  override def enqueue(item: Int): Unit = {
    val squareItem = item * item
    queue += squareItem
  }

  override def dequeue(): Int = {
    queue.remove(0)
  }
}


object OOPSAssignment1 {
  def main(args: Array[String]): Unit = {
    println("Use one of the following: ")
    println("1) Double Queue")
    println("2) Square Queue")
    val input = StdIn.readInt()
    if (input == 1) {
      doubleQueue()
    }
    else if (input == 2) {
      squareQueue()
    }
    else {
      println("Enter Correct Choice!")
    }
  }

  def doubleQueue(): Unit = {
    val doubleQueue = new DoubleQueue()
    var choice: Int = 1
    while (choice == 1 || choice == 2) {
      println("Enter 1 to enqueue ")
      println("Enter 2 to dequeue ")
      println("Press any other number to exit : ")
      choice = StdIn.readInt()
      if (choice == 1) {
        println("Enter Number : ")
        val item = StdIn.readInt()
        doubleQueue.enqueue(item)
        println("List after operation : " + doubleQueue.queue)
      }
      else if (choice == 2) {
        if (doubleQueue.queue.isEmpty)
          println("List is empty cannot deque!")
        else {
          println("Item removed is : " + doubleQueue.dequeue())
          println("List after operation : " + doubleQueue.queue)
        }
      }
    }
    println("List after operation : " + doubleQueue.queue)
  }


  def squareQueue(): Unit = {
    val squareQueue = new SquareQueue()
    var choice: Int = 1
    while (choice == 1 || choice == 2) {
      println("Enter 1 to enqueue ")
      println("Enter 2 to dequeue ")
      println("Press any other number to exit : ")
      choice = StdIn.readInt()
      if (choice == 1) {
        println("Enter Number : ")
        val item = StdIn.readInt()
        squareQueue.enqueue(item)
        println("List after operation : " + squareQueue.queue)
      }
      else if (choice == 2) {
        if (squareQueue.queue.isEmpty)
          println("List is empty cannot deque!")
        else {
          println("Item removed is : " + squareQueue.dequeue())
          println("List after operation : " + squareQueue.queue)
        }
      }
    }
    println("List after operation : " + squareQueue.queue)
  }
}
