// See https://aka.ms/new-console-template for more information

Console.WriteLine("Enter the numbers: ");
string Input = "0 " + Console.ReadLine();

Lab01__1_.FindTheAverage Average1 = new Lab01__1_.FindTheAverage();

int avg = Average1.CalculatingAvergae(Input);
Console.WriteLine(Convert.ToString(avg));



