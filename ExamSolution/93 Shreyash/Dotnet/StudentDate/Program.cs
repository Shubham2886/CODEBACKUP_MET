 int Id = int.Parse(args [0]);
 string name = args [1];
 string date = args [2];
 int m1 = int.Parse(args [3]);
 int m2 = int.Parse(args [4]);
 int m3 = int.Parse(args [5]);

 var Jake = new Student (Id, name, date, m1, m2,m3);

//  Console.WriteLine(Jake);
 Jake.Display();