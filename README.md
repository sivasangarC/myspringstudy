<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>My Java Learning Projects</title>
<style>
  :root {
    --bg: #0f1117;
    --surface: #1a1d27;
    --card: #1e2130;
    --border: #2a2d3e;
    --accent: #6c63ff;
    --accent2: #00d4aa;
    --text: #e2e8f0;
    --muted: #8892a4;
    --tag-bg: #252840;
    --code-bg: #12141e;
  }
  * { box-sizing: border-box; margin: 0; padding: 0; }
  body { background: var(--bg); color: var(--text); font-family: 'Segoe UI', system-ui, sans-serif; min-height: 100vh; }

  /* Hero */
  .hero {
    background: linear-gradient(135deg, #1a1d27 0%, #12141e 100%);
    border-bottom: 1px solid var(--border);
    padding: 60px 24px 48px;
    text-align: center;
    position: relative;
    overflow: hidden;
  }
  .hero::before {
    content: '';
    position: absolute; inset: 0;
    background: radial-gradient(ellipse 80% 60% at 50% 0%, rgba(108,99,255,.15), transparent);
    pointer-events: none;
  }
  .hero h1 { font-size: clamp(1.8rem, 4vw, 3rem); font-weight: 700; letter-spacing: -1px; }
  .hero h1 span { background: linear-gradient(90deg, var(--accent), var(--accent2)); -webkit-background-clip: text; -webkit-text-fill-color: transparent; }
  .hero p { color: var(--muted); margin-top: 12px; font-size: 1.05rem; max-width: 560px; margin-inline: auto; }
  .hero-stats { display: flex; justify-content: center; gap: 32px; margin-top: 32px; flex-wrap: wrap; }
  .stat { text-align: center; }
  .stat-num { font-size: 1.8rem; font-weight: 700; color: var(--accent2); }
  .stat-label { font-size: .78rem; color: var(--muted); text-transform: uppercase; letter-spacing: .5px; }

  /* Filter bar */
  .filter-bar { display: flex; gap: 10px; justify-content: center; flex-wrap: wrap; padding: 28px 24px 0; }
  .filter-btn {
    padding: 7px 18px; border-radius: 20px; border: 1px solid var(--border);
    background: var(--surface); color: var(--muted); cursor: pointer; font-size: .85rem;
    transition: all .2s;
  }
  .filter-btn:hover, .filter-btn.active { background: var(--accent); color: #fff; border-color: var(--accent); }

  /* Grid */
  .grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(340px, 1fr)); gap: 20px; padding: 28px 24px 60px; max-width: 1400px; margin: 0 auto; }

  /* Card */
  .card {
    background: var(--card); border: 1px solid var(--border); border-radius: 14px;
    display: flex; flex-direction: column; transition: transform .2s, border-color .2s, box-shadow .2s;
    overflow: hidden;
  }
  .card:hover { transform: translateY(-4px); border-color: var(--accent); box-shadow: 0 8px 32px rgba(108,99,255,.15); }
  .card-header { padding: 20px 20px 14px; display: flex; align-items: flex-start; gap: 14px; }
  .card-icon {
    width: 44px; height: 44px; border-radius: 10px; display: grid; place-items: center;
    font-size: 1.3rem; flex-shrink: 0;
  }
  .card-meta { flex: 1; min-width: 0; }
  .card-num { font-size: .72rem; color: var(--muted); text-transform: uppercase; letter-spacing: .5px; margin-bottom: 2px; }
  .card-title { font-size: 1.05rem; font-weight: 600; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; }
  .card-body { padding: 0 20px 16px; flex: 1; }
  .card-desc { font-size: .88rem; color: var(--muted); line-height: 1.6; }
  .tags { display: flex; flex-wrap: wrap; gap: 6px; margin-top: 12px; }
  .tag {
    padding: 3px 10px; border-radius: 12px; font-size: .75rem; font-weight: 500;
    background: var(--tag-bg); color: var(--accent2); border: 1px solid rgba(0,212,170,.15);
  }
  .tag.java { color: #f89820; border-color: rgba(248,152,32,.2); background: rgba(248,152,32,.08); }
  .tag.spring { color: #6db33f; border-color: rgba(109,179,63,.2); background: rgba(109,179,63,.08); }
  .tag.docker { color: #2496ed; border-color: rgba(36,150,237,.2); background: rgba(36,150,237,.08); }
  .tag.react { color: #61dafb; border-color: rgba(97,218,251,.2); background: rgba(97,218,251,.08); }
  .tag.ai { color: #a78bfa; border-color: rgba(167,139,250,.2); background: rgba(167,139,250,.08); }
  .tag.db { color: #f472b6; border-color: rgba(244,114,182,.2); background: rgba(244,114,182,.08); }

  /* Command section */
  .card-footer { padding: 14px 20px 18px; border-top: 1px solid var(--border); }
  .cmd-label { font-size: .72rem; color: var(--muted); text-transform: uppercase; letter-spacing: .5px; margin-bottom: 8px; }
  .cmd-block {
    background: var(--code-bg); border: 1px solid var(--border); border-radius: 8px;
    padding: 10px 14px; font-family: 'Cascadia Code', 'Fira Code', monospace; font-size: .8rem;
    color: var(--accent2); position: relative; overflow-x: auto; white-space: pre;
  }
  .copy-btn {
    position: absolute; top: 6px; right: 8px; background: var(--border); border: none;
    color: var(--muted); border-radius: 5px; padding: 2px 8px; font-size: .7rem; cursor: pointer;
    transition: background .2s, color .2s;
  }
  .copy-btn:hover { background: var(--accent); color: #fff; }

  /* Port badge */
  .port-badge {
    display: inline-flex; align-items: center; gap: 4px; font-size: .75rem;
    background: rgba(108,99,255,.12); color: var(--accent); border: 1px solid rgba(108,99,255,.25);
    border-radius: 8px; padding: 2px 9px; margin-top: 10px;
  }

  /* Prereq section */
  .prereq { padding: 10px 20px 0; }
  .prereq-title { font-size: .72rem; color: var(--muted); text-transform: uppercase; letter-spacing: .5px; margin-bottom: 6px; }
  .prereq-list { display: flex; flex-wrap: wrap; gap: 5px; }
  .prereq-item {
    font-size: .75rem; padding: 2px 9px; border-radius: 8px;
    background: rgba(255,255,255,.04); border: 1px solid var(--border); color: var(--muted);
  }

  /* Responsive */
  @media (max-width: 480px) { .grid { grid-template-columns: 1fr; padding: 16px; } }
</style>
</head>
<body>

<div class="hero">
  <h1>My <span>Java Learning</span> Projects</h1>
  <p>From DSA basics to Spring AI — a full backend learning journey in one place.</p>
  <div class="hero-stats">
    <div class="stat"><div class="stat-num">15</div><div class="stat-label">Projects</div></div>
    <div class="stat"><div class="stat-num">5</div><div class="stat-label">Technologies</div></div>
    <div class="stat"><div class="stat-num">3</div><div class="stat-label">Java Versions</div></div>
  </div>
</div>

<div class="filter-bar">
  <button class="filter-btn active" onclick="filter('all', this)">All</button>
  <button class="filter-btn" onclick="filter('java', this)">Java</button>
  <button class="filter-btn" onclick="filter('spring', this)">Spring</button>
  <button class="filter-btn" onclick="filter('docker', this)">Docker</button>
  <button class="filter-btn" onclick="filter('ai', this)">AI</button>
  <button class="filter-btn" onclick="filter('react', this)">React</button>
  <button class="filter-btn" onclick="filter('db', this)">Database</button>
</div>

<div class="grid" id="grid"></div>

<script>
const projects = [
  {
    num: "01", icon: "🔍", color: "#f89820",
    title: "DSA Practice",
    folder: "DSA practice/dsa/",
    desc: "Plain Java files for binary search, bubble sort, and selection sort. No build tool needed.",
    tags: ["java"],
    cmd: "javac binarysearch.java && java Main",
    prereqs: ["Java JDK"],
  },
  {
    num: "02", icon: "☕", color: "#f89820",
    title: "Java Practice",
    folder: "java practice/java/",
    desc: "Core Java topics — lambdas, streams, threads, collections, exceptions, and more.",
    tags: ["java"],
    cmd: "javac lambda.java && java lambda",
    prereqs: ["Java JDK"],
  },
  {
    num: "03", icon: "🗄️", color: "#f472b6",
    title: "Hibernate",
    folder: "hibernate/",
    desc: "Map Java classes to DB tables and save/fetch data without writing SQL. Uses OneToOne relationship between Alien and Laptop.",
    tags: ["java", "db"],
    cmd: 'cd hibernate\nmvn exec:java -Dexec.mainClass="com.hib.Main"',
    prereqs: ["Java 25", "Maven", "PostgreSQL"],
    port: null,
    note: "DB: courseman | hbm2ddl: create (drops on restart)"
  },
  {
    num: "04", icon: "🌱", color: "#6db33f",
    title: "Spring1 — Core Spring",
    folder: "Spring1/",
    desc: "Plain Spring IoC container with AnnotationConfigApplicationContext. No Spring Boot.",
    tags: ["spring"],
    cmd: 'cd Spring1\nmvn exec:java -Dexec.mainClass="org.exam.App"',
    prereqs: ["Java 17+", "Maven"],
  },
  {
    num: "05", icon: "🐱", color: "#f89820",
    title: "ServletEx — Embedded Tomcat",
    folder: "ServletEx/",
    desc: "Starts an embedded Tomcat server programmatically. No external Tomcat needed.",
    tags: ["java", "spring"],
    cmd: 'cd ServletEx\nmvn exec:java -Dexec.mainClass="org.exa.App"',
    prereqs: ["Java 17+", "Maven"],
    port: "8081",
    url: "http://localhost:8081/hello"
  },
  {
    num: "06", icon: "🚀", color: "#6db33f",
    title: "SpringBootWeb1",
    folder: "SpringBootWeb1/SpringBootWeb1/",
    desc: "Basic Spring Boot web project to understand how auto-configuration works.",
    tags: ["spring"],
    cmd: "cd SpringBootWeb1/SpringBootWeb1\nmvn spring-boot:run",
    prereqs: ["Java 17+", "Maven"],
  },
  {
    num: "07", icon: "💉", color: "#6db33f",
    title: "SpringStarter — DI",
    folder: "SpringStarter/SpringStarter/",
    desc: "@Component and @Autowired practice. Spring auto-creates Alien and Laptop beans and injects Laptop into Alien.",
    tags: ["spring"],
    cmd: "cd SpringStarter/SpringStarter\nmvn spring-boot:run",
    prereqs: ["Java 25", "Maven"],
    note: "Spring Boot 4.0.1"
  },
  {
    num: "08", icon: "💼", color: "#6db33f",
    title: "JobApp — MVC + JSP",
    folder: "7 JobApp-Project/",
    desc: "Full MVC web app with JSP pages. Add job posts and view them in the browser. In-memory storage.",
    tags: ["spring"],
    cmd: 'cd "7 JobApp-Project"\nmvn spring-boot:run',
    prereqs: ["Java 21", "Maven"],
    port: "8080",
    url: "http://localhost:8080/"
  },
  {
    num: "09", icon: "🔌", color: "#f472b6",
    title: "Spring REST + PostgreSQL",
    folder: "Le-320-Spring Project with DB/spring-boot-rest/",
    desc: "REST API with Spring Data JPA connected to PostgreSQL. Full CRUD endpoints with keyword search.",
    tags: ["spring", "db"],
    cmd: 'cd "Le-320-Spring Project with DB/spring-boot-rest"\nmvn spring-boot:run',
    prereqs: ["Java 21", "Maven", "PostgreSQL"],
    port: "5000",
    url: "http://localhost:5000/jobPosts",
    note: "DB: telusko | Spring Boot 3.2.1"
  },
  {
    num: "10", icon: "🔐", color: "#a78bfa",
    title: "OAuth2 — GitHub & Google",
    folder: "OAuth2/",
    desc: "OAuth2 login with GitHub and Google. Hitting /hello redirects to login first.",
    tags: ["spring"],
    cmd: "cd OAuth2\nmvn spring-boot:run",
    prereqs: ["Java 21", "Maven", "OAuth2 credentials"],
    port: "8080",
    url: "http://localhost:8080/hello",
    note: "Spring Boot 3.2.4 — add client-id & secret in application.properties"
  },
  {
    num: "11", icon: "🐳", color: "#2496ed",
    title: "Docker Volumes",
    folder: "Docker_Volumes/student-app/",
    desc: "Spring Boot + PostgreSQL via Docker Compose. Data persists in a Docker volume even after containers stop.",
    tags: ["docker", "db"],
    cmd: "cd Docker_Volumes/student-app\nmvn clean package -DskipTests\ndocker-compose up --build",
    prereqs: ["Docker Desktop", "Maven"],
    port: "8090",
    url: "http://localhost:8090"
  },
  {
    num: "12", icon: "📦", color: "#2496ed",
    title: "Multiple Containers",
    folder: "Running_Multiple_Containers/student-app/",
    desc: "Same as Docker Volumes but without persistence. Data is lost when containers stop. Good for understanding basics.",
    tags: ["docker"],
    cmd: "cd Running_Multiple_Containers/student-app\nmvn clean package -DskipTests\ndocker-compose up --build",
    prereqs: ["Docker Desktop", "Maven"],
    port: "8090",
    url: "http://localhost:8090"
  },
  {
    num: "13", icon: "🤖", color: "#a78bfa",
    title: "Spring AI — OpenAI Chat",
    folder: "springai/demo/demo/",
    desc: "Connects to OpenAI and returns AI responses. Send a message via URL and get plain text back.",
    tags: ["spring", "ai"],
    cmd: "cd springai/demo/demo\nmvn spring-boot:run",
    prereqs: ["Java", "Maven", "OpenAI API key"],
    port: "8081",
    url: "http://localhost:8081/api/Hello how are you",
    note: "Add spring.ai.openai.api-key in application.properties"
  },
  {
    num: "14", icon: "🛒", color: "#a78bfa",
    title: "SpringEcomAI — Vector Store",
    folder: "SpringAICode_Le_Add Order in the Vector Store/SpringEcomAI/",
    desc: "E-commerce backend with AI chatbot using pgvector + RAG. Answers product questions by searching embeddings.",
    tags: ["spring", "ai", "db", "docker"],
    cmd: 'cd "SpringAICode_Le_Add Order in the Vector Store/SpringEcomAI"\ndocker-compose up -d\nmvn spring-boot:run',
    prereqs: ["Java", "Maven", "Docker Desktop", "OpenAI API key"],
    note: "Uses GPT-4o + pgvector. Start Docker first."
  },
  {
    num: "15", icon: "⚛️", color: "#61dafb",
    title: "Ecom Frontend — React + Vite",
    folder: "ecom-frontend-1-main/ecom-frontend-1-main/",
    desc: "React frontend for the e-commerce app. Product list and add product pages. Connects to Spring Boot via Axios.",
    tags: ["react"],
    cmd: "cd ecom-frontend-1-main/ecom-frontend-1-main\nnpm install\nnpm run dev",
    prereqs: ["Node.js 18+", "npm"],
    port: "5173",
    url: "http://localhost:5173",
    note: "Start Spring Boot backend first"
  },
];

function tagClass(t) {
  const map = { java:'java', spring:'spring', docker:'docker', react:'react', ai:'ai', db:'db' };
  return map[t] || '';
}

function buildCard(p) {
  const tagsHtml = p.tags.map(t => `<span class="tag ${tagClass(t)}">${t}</span>`).join('');
  const prereqHtml = p.prereqs ? `
    <div class="prereq">
      <div class="prereq-title">Requires</div>
      <div class="prereq-list">${p.prereqs.map(r => `<span class="prereq-item">${r}</span>`).join('')}</div>
    </div>` : '';
  const portHtml = p.port ? `<div class="port-badge">🌐 localhost:${p.port}</div>` : '';
  const noteHtml = p.note ? `<div style="font-size:.75rem;color:#8892a4;margin-top:8px;font-style:italic">${p.note}</div>` : '';
  const urlHtml = p.url ? `<div style="font-size:.75rem;margin-top:6px;color:#6c63ff">→ <a href="${p.url}" target="_blank" style="color:#6c63ff;text-decoration:none">${p.url}</a></div>` : '';

  return `
  <div class="card" data-tags="${p.tags.join(' ')}">
    <div class="card-header">
      <div class="card-icon" style="background:${p.color}18;border:1px solid ${p.color}30">${p.icon}</div>
      <div class="card-meta">
        <div class="card-num">Project ${p.num}</div>
        <div class="card-title">${p.title}</div>
      </div>
    </div>
    <div class="card-body">
      <div class="card-desc">${p.desc}</div>
      <div class="tags" style="margin-top:10px">${tagsHtml}</div>
      ${portHtml}${urlHtml}${noteHtml}
    </div>
    ${prereqHtml}
    <div class="card-footer">
      <div class="cmd-label">Run Command</div>
      <div class="cmd-block" id="cmd-${p.num}">${p.cmd}<button class="copy-btn" onclick="copy('cmd-${p.num}', this)">copy</button></div>
    </div>
  </div>`;
}

document.getElementById('grid').innerHTML = projects.map(buildCard).join('');

function filter(tag, btn) {
  document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
  btn.classList.add('active');
  document.querySelectorAll('.card').forEach(card => {
    card.style.display = (tag === 'all' || card.dataset.tags.includes(tag)) ? '' : 'none';
  });
}

function copy(id, btn) {
  const el = document.getElementById(id);
  const text = el.innerText.replace('copy','').trim();
  navigator.clipboard.writeText(text).then(() => {
    btn.textContent = '✓';
    setTimeout(() => btn.textContent = 'copy', 1500);
  });
}
</script>
</body>
</html>
```
