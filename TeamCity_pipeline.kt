package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object JuiceShopTeamCityCiCdImplementation : BuildType({
    name = "Juice_Shop_TeamCity_CI-CD_implementation"

    artifactRules = """
        OWASPZAP_scanns\zap\ZAP_REPORT.html
        OWASPZAP_scanns\zap\ZAP_ALERT_REPORT.md
    """.trimIndent()

    vcs {
        root(HttpsGithubComThesis2024FilipStefanskiJuiceShopTeamCityCiCdImplementation)
    }
    steps {
        powerShell {
            name = "Build application"
            scriptMode = script {
                content = """
                    # Install aplication
                    npm install
                    
                    # Start application in background
                    Start-Process -WindowStyle Minimized -FilePath npm -ArgumentList start
                """.trimIndent()
            }
        }
        powerShell {
            name = "Run OWASP ZAP"
            scriptMode = script {
                content = """
                    ${'$'}path = pwd
                    # Create a direcory where scanns will be saved to
                    mkdir .\OWASPZAP_scanns\zap
                    
                    # Run OWASP ZAP
                    cd 'D:\OWASPZAP\Zed Attack Proxy\'
                    .\zap.bat -cmd -autorun ${'$'}path\OWASPZAP_scanns\NodeGoat_full.yaml
                """.trimIndent()
            }
        }
        powerShell {
            name = "Clear Docker data"
            enabled = false
            scriptMode = script {
                content = """
                    docker stop ${'$'}(docker ps -aq)
                    docker system prune -a --volumes -f
                """.trimIndent()
            }
        }
    }
    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})
