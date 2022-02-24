package p

class EncryptedWriter[T] extends Writer[T]:
  override def send(x: T) = super.send(encrypt(x))
  def encrypt(x: T) = ???

