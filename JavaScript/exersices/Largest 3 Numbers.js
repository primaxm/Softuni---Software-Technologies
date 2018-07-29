function solve(arr) {
  arr.sort(function(a, b) {
    return b - a
  });

  for (let i = 0; i < arr.length; i++) {
    if (i > 2)
      break;
    console.log(arr[i]);

  }

}

solve([
  10,
  30,
  15,
  20,
  50,
  5
]);
