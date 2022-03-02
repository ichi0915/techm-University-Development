techm-University-Development

# Welcome to temporal TechM university repo for Devs

Create folders using snake case


## Compile and run
Compilar:
```bash
javac FileName.java
```
Correr:
```bash
java ClassName
```
## Mentees
Fork the project

Clone the repo
```bash
git clone git@github.com:<your.space>/techm-university-development.git
```

Add remote upstream
```bash
git remote add upstream git@gitlab.com:ichi0915/techm-university-development.git
```

Create your branch from master
```bash
git checkout -b <generationName>/<name-lastname>
```

Push your branch to upstream
```bash
git push -u upstream <generationName>/<name-lastname>
```

Create subsequent branches from your branch `<generationName>/<name-lastname>`
```bash
git checkout <generationName>/<name-lastname>
git checkout -b new-branch
git push -u origin new-branch
```

Create Merge Request using your branch(`<generationName>/<name-lastname>`) as target

Update master branch
```bash
git fetch upstream
git checkout master
git rebase -i upstream/master
git push origin master
```

Rebase your branch from master
```bash
git fetch upstream
git checkout <generationName>/<name-lastname>
git rebase -i upstream/master
git push upstream <generationName>/<name-lastname>
```

## Mentors

Create a folder for docs

Create a folder for source

All the subjects should have a README
