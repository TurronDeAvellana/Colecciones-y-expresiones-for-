package object Canicas {

  type Frasco = (Int,Int)
  type Distr = List[Frasco]

  def canicasPosiblesFrasco(f:Int, c:Int): List[Frasco] ={
    val lista = for{
      n <- 0 until c+1
    } yield ((f,n))
    lista.toList
  }

  def canicasPorFrasco(n:Int, c:Int): List[Distr]={
    val lista = for{
      x <- 1 until n+1
    } yield (canicasPosiblesFrasco(x,c))

    lista.toList
  }

  def mezclarLCanicas(lc: List[Distr]): List[Distr] = {
    lc match {
      case Nil => List(List())
      case head :: tail =>
        for {
          h <- head
          t <- mezclarLCanicas(tail)
        } yield h :: t
    }
  }