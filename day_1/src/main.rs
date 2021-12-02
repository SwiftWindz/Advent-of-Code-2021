use std::fs::File;
use std::io::{BufRead, BufReader};

//@author Phil Ganem
//https://adventofcode.com/2021/day/1

fn main(){
    //Open file
    let file = File::open("data\\data.txt")
        .unwrap();
    //Buffered file reader    
    let reader = BufReader::new(file);
    //Number of depth increases
    let mut count = 0;
    //previous depth
    let mut prev_depth = 0;

    for line in reader.lines(){
        //Unwrap line of file data
        let line = line
            .unwrap();
        //Cast line to int
        let line_int: i32 = line
            .parse()
            .unwrap();
            
        //Increases count of depth increases if its not the first iteration and
        //depth increased over previous interation 
        if prev_depth != 0 && line_int > prev_depth {count = count + 1;}
        //sets prev depth to current depth
        prev_depth = line_int;
    }

    println!("Number of depth increases: {}", count)
}