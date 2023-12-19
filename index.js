import simplegit from "simple-git"
import moment from "moment"
import jsonfile from "jsonfile"
import random from "random"
const FILE_PATH = "./data.json";

const makecommit = (n) => {
  if (n === 0) return simplegit().push();
  const x = random.int(0, 54);
  const y = random.int(0, 6);
  const DATE = moment()
    .subtract(1, "y")
    .add(1, "d")
    .add(x, "w")
    .add(y, "d")
    .format();
  const data = {
    date: DATE,
  };
  console.log(DATE);
  jsonfile.writeFile(FILE_PATH, data, () => {
    simplegit()
      .add(FILE_PATH)
      .commit(DATE, { "--date": DATE }, makecommit.bind(this, --n));
  });
};
makecommit(20);