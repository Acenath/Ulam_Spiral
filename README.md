# Ulam Spiral Visualization in Java
- This project visualizes the Ulam spiral using Java's Canvas and Graphics classes. The Ulam spiral arranges natural numbers in a spiral pattern, often highlighting patterns in prime numbers.

# What is the Ulam Spiral?
- The Ulam spiral is a graphical representation of natural numbers, first described by mathematician Stanislaw Ulam in 1963. Numbers are arranged in a spiral, starting from the center, with prime numbers often appearing in diagonal lines. This simple arrangement can reveal surprising patterns in the distribution of prime numbers.

For more information, you can check out:

Wikipedia: Ulam Spiral
Numberphile: Ulam Spiral Video

# Project Description
- This Java program demonstrates an animated visualization of the Ulam spiral:

- Spiral Plotting: Numbers are arranged in a spiral, starting at the center of the canvas.
- Incremental Animation: The spiral grows outward, with each number plotted sequentially.
- Connecting Lines: Lines are drawn to connect consecutive numbers, forming a continuous path.
- Configurable Settings: Line thickness, step size, and animation speed can be adjusted.

# How It Works
- Starts from the center of the canvas, plotting numbers outward in a spiral.
- Moves in four directions: right, up, left, and down, following a pattern of expanding steps.
- Increases step size after two turns to expand the spiral outward.
- Repeats the process, animating each update with a delay.
  
# Prerequisites
- Java Development Kit (JDK): Make sure you have Java installed. Download it from Oracle's website or OpenJDK.
  
# Installation
- Clone the repository:
git clone: `https://github.com/yourusername/ulam-spiral-visualization.git`

# Configuration
- You can customize various settings in the code:

- Step Size (stepSize): Adjust the distance between consecutive points.
- Line Thickness (lineThickness): Set the thickness of the lines connecting the numbers.
- Animation Speed (Thread.sleep): Change the delay to control how fast the spiral updates.
- Code Structure
- Main.java: The entry point of the application. Sets up the window (frame) and adds the custom canvas (MyCanvas).
- MyCanvas.java: Extends the Canvas class to implement the custom drawing logic for plotting numbers and connecting lines in the spiral.
  

Pause/Resume Animation: Add controls to interact with the animation.
Troubleshooting
Window Not Closing: Ensure the window listener is set up correctly in the Main.java to handle the closing event.
Flickering Issues: Consider using double-buffering techniques to reduce flickering.
Contributing
Contributions are welcome! If you have ideas for improvements or new features, feel free to open an issue or create a pull request.
