using System;

namespace details
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your name:");
            string name = Console.ReadLine();

            Console.WriteLine("Enter your age:");
            int age = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter your grade level:");
            int gradeLevel = int.Parse(Console.ReadLine());

            Console.WriteLine("\nThank you!");
            Console.WriteLine();
            Console.ReadKey();
        }
    }
}