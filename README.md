# is247gameoflife
UMBC IS 247 School Project Game of Life

The Game of Life, also known as Conway's Game of Life, is a cellular automaton devised by mathematician John Conway in 1970. It is not a traditional game in the sense of having players or objectives, but rather a mathematical model and simulation.

Here's how it works:

1. **Grid**: The Game of Life is played on an infinite two-dimensional grid of square cells, although in practice, a finite-sized grid is used for computation.

2. **States**: Each cell can be in one of two states: alive or dead (or on or off). You can think of these as being black or white squares on the grid.

3. **Rules**: The game evolves in discrete time steps (generations) based on a set of rules:

   - Any live cell with fewer than two live neighbors dies, as if by underpopulation.
   - Any live cell with two or three live neighbors lives on to the next generation.
   - Any live cell with more than three live neighbors dies, as if by overpopulation.
   - Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

4. **Generation**: The entire grid is updated simultaneously following these rules for each cell. This means that all cells change their state at the same time.

5. **Patterns**: The Game of Life starts with an initial configuration of live and dead cells. As you let it evolve through generations, you can observe various patterns, such as still lifes (patterns that remain unchanged), oscillators (patterns that cycle through a set of configurations), and spaceships (patterns that move across the grid).

Despite its simple rules, the Game of Life can exhibit complex and fascinating behavior. It's not a game you play in the traditional sense, but rather a way to explore emergent phenomena and study the behavior of cellular automata.

Many computer programs and simulations are available that allow you to create and explore patterns in the Game of Life, making it a popular subject of study in mathematics and computer science.
