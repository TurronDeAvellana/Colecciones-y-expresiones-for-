package object Canicas {

  type Frasco = (Int,Int)
  type Distr = List[Frasco]

  def canicasPosiblesFrasco(f:Int, c:Int): List[Frasco] ={

    val lista = for{
      n <- 0 until c+1
    } yield ((f,n))
    lista.toList
  }
}
