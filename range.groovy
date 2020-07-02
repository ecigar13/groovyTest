def numRange = 3..9
def charRange = 'a'..'f'

println(numRange.getClass())
println(charRange.getClass())
assert numRange[-1] == 9
assert charRange[0] == 'a'

