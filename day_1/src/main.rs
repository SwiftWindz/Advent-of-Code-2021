use std::fs::File;
use std::io::{BufRead, BufReader};

//@author Phil Ganem
//https://adventofcode.com/2021/day/1

//Path to data set
static SUB_DEPTH_PATH: &'static str  = "data\\data.txt";

fn part_one(){
    //Open file
    let file = File::open(SUB_DEPTH_PATH)
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

    println!("[PART 1] Number of depth increases: {}", count)
}

fn part_two(){
    //Open file
    let file = File::open(SUB_DEPTH_PATH)
        .unwrap();
    //Buffered file reader    
    let reader = BufReader::new(file);
    //Maps lines to a vector
    let num_vec: Vec<usize> = reader
        .lines()
        .map(|s| s.unwrap().parse::<usize>().unwrap())
        .collect();
    // Number of depth increases
    let count: Vec<usize> = num_vec
        .windows(3)
        .map(|x| x.to_vec().iter().sum())
        .collect();

    //Prints answer
    println!(
        "[PART 2] Number of depth increases: {}", count
        .iter()
        .zip(&count[1..])
        .filter(|(a, b)| b > a)
        .count()
    );
}

fn main(){
    part_one();
    part_two();
}
