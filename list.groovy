List temp = [1,2,3,4,'a']
print(temp[-1])
temp.add('---')
println(temp[-1])

List temp1 = temp.clone()
println(temp1)
assert temp == temp1

a = 1
println(a)

temp.each{ it -> println("Item: $it")
}

temp.eachWithIndex{item, index -> println("Item index $index: $item")}