package p

class Writer[T]:

  /** Sends to stdout, can be overridden */
 def send(x: T) = println(x)

  /** Sends all arguments using `send` */
  def sendAll(xs: T*) = xs.foreach(send)
end Writer