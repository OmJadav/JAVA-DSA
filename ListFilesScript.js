const fs = require("fs");
const path = require("path");

const folderName = process.argv[2]?.toLowerCase();

if (!folderName) {
  console.log("Please provide a folder name");
  process.exit(1);
}

const folderPath = path.join(__dirname, folderName);

if (!fs.existsSync(folderPath)) {
  console.log("Folder does not exist!");
  process.exit(1);
}

const files = fs.readdirSync(folderPath);
const quesArray = [];

files.forEach((file) => {
  if (file.endsWith(".java")) {
    const javaFileName = file.replace(".java", "");
    const lowerName = javaFileName.toLowerCase();
    if (lowerName.includes("leetcode")) {
      const queNumber = lowerName.split("leetcode")[1];
      quesArray.push(queNumber);
    }
  }
});

console.log(`Total Questions in ${folderName}:`, quesArray.length);

if (quesArray.length === 0) {
  console.log("No questions found");
} else {
  const randomElement = quesArray[Math.floor(Math.random() * quesArray.length)];
  console.log("Random Question:", randomElement);
}
