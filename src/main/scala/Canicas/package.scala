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

  def mezclarLCanicas(lc: List[Distr]): List[Distr]={

    val lista = for{l <- lc} yield{
      l
    }

    lista.toList



  }
/*
  def mezclarLCanicas(lc: List[Distr]): List[Distr]={
    //List(lc(0)(0))
    //List(List(lc(0)(0)),List(lc(0)(1)))

    val lista = for{
      x <- 0 until lc.length

    } yield(lc(x))

    lista.toList

  }


 */

}
