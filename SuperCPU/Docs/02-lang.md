
Use `bit` as fundamental unit, consider `tri` or similar whn introducing tri-state logic. 

after params/inputs/outputs, aim for a rules section within the hardware module explaining how it works. split across
- `always`: Combinatorial logic; output continusouly evaluated as `f(inputs)`
- `when`: transition block at edge triggers; i.e. specifically stateful registers that react to a change (`rise` or `fall` of some value)
