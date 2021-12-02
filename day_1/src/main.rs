use std::fs::File;
use std::io::{BufRead, BufReader};

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
        let line = line.unwrap();
        let line_int: i32 = line.parse().unwrap();
        
        if prev_depth != 0 && line_int > prev_depth {count = count + 1;}

        prev_depth = line_int;
    }

    println!("Number of depth increases: {}", count)
}