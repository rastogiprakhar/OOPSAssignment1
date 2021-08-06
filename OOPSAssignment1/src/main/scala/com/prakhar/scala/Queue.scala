package com.prakhar.scala

trait Queue {
  def enqueue(item: Int): Unit

  def dequeue(): Int
}