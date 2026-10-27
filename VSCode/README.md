# SuperHDL VS Code Extension

This extension supplies syntax highlighting and basic editor behavior for
`.shdl` source files. It has no compiler integration or runtime dependencies.

## Run locally

1. Open the `VSCode/` directory in VS Code.
2. Press `F5` to start an Extension Development Host window.
3. Open any `.shdl` file in that window.

The language mode in the editor status bar should read `SuperHDL`.

## Included syntax

The grammar reflects the language syntax currently being explored:

- `module`, `init`, `inputs`, `outputs`, `build`, `always`, and `when`
- `add`, `if`, `else`, `assert`, and `rise`
- `bit`, `int`, `self`, integer literals, comments, and operators
