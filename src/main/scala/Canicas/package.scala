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

  //Esta es la prueba #1 que funciona especificamente para la entrada (3,n)

  def mezclarLCanicas(lc: List[Distr]): List[Distr] ={
    val numeroDeFrascos = lc.length
    val numeroDeCanicas = (lc(0).length)

    val lista = {
      for{

        y <- 0 until numeroDeCanicas
        c <- 0 until numeroDeCanicas
        x <- 0 until numeroDeCanicas

      }yield {List(lc(0)(y), lc(1)(c), lc(2)(x))}
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
