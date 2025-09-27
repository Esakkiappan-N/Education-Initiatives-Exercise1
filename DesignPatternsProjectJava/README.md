# DesignPatternsProject (Java)

A compact Java project demonstrating six use-cases of design patterns as requested.

## Implemented Patterns

- Behavioral: Observer, Strategy
- Creational: Factory Method, Builder
- Structural: Adapter, Facade

## How to run

1. Copy `src` contents to a local folder maintaining package structure.

2. Compile (Java 11+ recommended):

```bash
javac -d out $(find src -name "*.java")
```

3. Run:

```bash
java -cp out com.example.designpatterns.Launcher
```

## Notes on quality

- Uses `java.util.logging` for logging
- Defensive programming: validations and clear exceptions
- Each class in its own file and package
- Minimal external dependencies (none)

## How to upload to GitHub quickly

```bash
cd <project-root>
git init
git add .
git commit -m "Initial commit - DesignPatternsProject"
# create a repository on GitHub, then:
git remote add origin git@github.com:<your-username>/<repo-name>.git
git branch -M main
git push -u origin main
```

## License
MIT
