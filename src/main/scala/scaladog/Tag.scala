package scaladog

sealed trait Tag {
  def asString: String
  def asTag: Tag = this
}

object Tag {

  case class Value(value: String) extends Tag {
    val asString: String = value
  }

  case class KeyValue(key: String, value: String) extends Tag {
    val asString: String = s"$key:$value"
  }

  def apply(str: String): Tag = {
    val (left, right) = str.span(_ != ':')
    if (right.isEmpty) Value(left)
    else KeyValue(left, right.drop(1))
  }

  implicit val readwriter: DDPickle.ReadWriter[Tag] =
    DDPickle.readwriter[String].bimap(_.asString, apply)
}