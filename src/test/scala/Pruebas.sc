import Canicas._

//Casos de prueba

//canicasPosiblesFrasco

//Caso de prueba: 1
canicasPosiblesFrasco(0,0) // List((0,0))
//Caso de prueba: 2
canicasPosiblesFrasco(1,0) // List((1,0))
//Caso de prueba: 3
canicasPosiblesFrasco(2,7) // List((2,0), (2,1), (2,2), (2,3), (2,4), (2,5), (2,6), (2,7))
//Caso de prueba: 4
canicasPosiblesFrasco(10,10) // List((10,0), (10,1), (10,2), (10,3), (10,4), (10,5), (10,6), (10,7), (10,8), (10,9), (10,10))
//Caso de prueba: 5
canicasPosiblesFrasco(5,5) // List((5,0), (5,1), (5,2), (5,3), (5,4), (5,5))

//canicasPorFrasco

//Caso de prueba: 6
canicasPorFrasco(0,0) //List()
//Caso de prueba: 7
canicasPorFrasco(1,0) //List(List((1,0)))
//Caso de prueba: 8
canicasPorFrasco(2,3) //List(List((1,0), (1,1), (1,2), (1,3)), List((2,0), (2,1), (2,2), (2,3)))
//Caso de prueba: 9
canicasPorFrasco(3,2) //List(List((1,0), (1,1), (1,2)), List((2,0), (2,1), (2,2)), List((3,0), (3,1), (3,2)))
//Caso de prueba: 10
canicasPorFrasco(3,5) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5)), List((2,0), (2,1), (2,2), (2,3), (2,4), (2,5)), List((3,0), (3,1), (3,2), (3,3), (3,4), (3,5)))
//Caso de prueba: 11
canicasPorFrasco(3,9) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9)), List((2,0), (2,1), (2,2), (2,3), (2,4), (2,5), (2,6), (2,7), (2,8), (2,9)), List((3,0), (3,1), (3,2), (3,3), (3,4), (3,5), (3,6), (3,7), (3,8), (3,9)))

//mezclarLCanicas

//Caso de prueba: 12
mezclarLCanicas(canicasPorFrasco(0,0)) //List(List())
//Caso de prueba: 13
mezclarLCanicas(canicasPorFrasco(1,0)) //List(List((1,0)))
//Caso de prueba: 14
mezclarLCanicas(canicasPorFrasco(2,3)) // Al final
//Caso de prueba: 15
mezclarLCanicas(canicasPorFrasco(3,2)) // Al final
//Caso de prueba: 16
mezclarLCanicas(canicasPorFrasco(3,5)) // Al final
//Caso de prueba: 17
mezclarLCanicas(canicasPorFrasco(3,9)) // Al final

//distribucion

//Caso de prueba: 18
distribucion(0,0,0) //List(List())
//Caso de prueba: 19
distribucion(1,1,1) //List(List((1,1)))
//Caso de prueba: 20
distribucion(6,3,3) //
//Caso de prueba: 21
distribucion(10,5,6) //
//Caso de prueba: 22
distribucion(5,2,3) //List(List((1,2), (2,3)), List((1,3), (2,2)))
//Caso de prueba: 23
distribucion(1,5,1) //

//Resultados esperados para los casos de prueba

//prueba: 14
//List(List((1,0), (2,0)), List((1,0), (2,1)), List((1,0), (2,2)), List((1,0), (2,3)), List((1,1), (2,0)), List((1,1), (2,1)), List((1,1), (2,2)), List((1,1), (2,3)), List((1,2), (2,0)), List((1,2), (2,1)), List((1,2), (2,2)), List((1,2), (2,3)), List((1,3), (2,0)), List((1,3), (2,1)), List((1,3), (2,2)), List((1,3), (2,3)))

//prueba: 15
//List(List((1,0), (2,0), (3,0)), List((1,0), (2,0), (3,1)), List((1,0), (2,0), (3,2)), List((1,0), (2,1), (3,0)), List((1,0), (2,1), (3,1)), List((1,0), (2,1), (3,2)), List((1,0), (2,2), (3,0)), List((1,0), (2,2), (3,1)), List((1,0), (2,2), (3,2)), List((1,1), (2,0), (3,0)), List((1,1), (2,0), (3,1)), List((1,1), (2,0), (3,2)), List((1,1), (2,1), (3,0)), List((1,1), (2,1), (3,1)), List((1,1), (2,1), (3,2)), List((1,1), (2,2), (3,0)), List((1,1), (2,2), (3,1)), List((1,1), (2,2), (3,2)), List((1,2), (2,0), (3,0)), List((1,2), (2,0), (3,1)), List((1,2), (2,0), (3,2)), List((1,2), (2,1), (3,0)), List((1,2), (2,1), (3,1)), List((1,2), (2,1), (3,2)), List((1,2), (2,2), (3,0)), List((1,2), (2,2), (3,1)), List((1,2), (2,2), (3,2)))

//prueba: 16
//List(List((1,0), (2,0), (3,0)), List((1,0), (2,0), (3,1)), List((1,0), (2,0), (3,2)), List((1,0), (2,0), (3,3)), List((1,0), (2,0), (3,4)), List((1,0), (2,0), (3,5)), List((1,0), (2,1), (3,0)), List((1,0), (2,1), (3,1)), List((1,0), (2,1), (3,2)), List((1,0), (2,1), (3,3)), List((1,0), (2,1), (3,4)), List((1,0), (2,1), (3,5)), List((1,0), (2,2), (3,0)), List((1,0), (2,2), (3,1)), List((1,0), (2,2), (3,2)), List((1,0), (2,2), (3,3)), List((1,0), (2,2), (3,4)), List((1,0), (2,2), (3,5)), List((1,0), (2,3), (3,0)), List((1,0), (2,3), (3,1)), List((1,0), (2,3), (3,2)), List((1,0), (2,3), (3,3)), List((1,0), (2,3), (3,4)), List((1,0), (2,3), (3,5)), List((1,0), (2,4), (3,0)), List((1,0), (2,4), (3,1)), List((1,0), (2,4), (3,2)), List((1,0), (2,4), (3,3)), Lis...

//prueba: 17
//List(List((1,0), (2,0), (3,0)), List((1,0), (2,0), (3,1)), List((1,0), (2,0), (3,2)), List((1,0), (2,0), (3,3)), List((1,0), (2,0), (3,4)), List((1,0), (2,0), (3,5)), List((1,0), (2,0), (3,6)), List((1,0), (2,0), (3,7)), List((1,0), (2,0), (3,8)), List((1,0), (2,0), (3,9)), List((1,0), (2,1), (3,0)), List((1,0), (2,1), (3,1)), List((1,0), (2,1), (3,2)), List((1,0), (2,1), (3,3)), List((1,0), (2,1), (3,4)), List((1,0), (2,1), (3,5)), List((1,0), (2,1), (3,6)), List((1,0), (2,1), (3,7)), List((1,0), (2,1), (3,8)), List((1,0), (2,1), (3,9)), List((1,0), (2,2), (3,0)), List((1,0), (2,2), (3,1)), List((1,0), (2,2), (3,2)), List((1,0), (2,2), (3,3)), List((1,0), (2,2), (3,4)), List((1,0), (2,2), (3,5)), List((1,0), (2,2), (3,6)), List((1,0), (2,2), (3,7)), Lis...




