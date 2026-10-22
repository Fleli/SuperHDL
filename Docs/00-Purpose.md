
Purpose of the project is to learn how HDLs work, improve at compiler optimizations (I've implemented a compiler but its optimization abilities were limited) and then eventually actually use the language. Fun end goal would be building a small CPU + GPU system to train a very small LLM.

Will specifically avoid vibe-coding. Use LLMs for routine code writing, but _always_ do one file at a time and never let LLMs make decisions. Basically just use to write code where I know what I want, just don't want to type it out.

Scope: Quite minimal language implementation; spend more time on optimization and emitter logic. Already know well how lexing & parsing work, so focus is on what makes _hardware_ special and how to optimize it.

Build monorepo; keep the entire stack within one repository so they evolve together.
