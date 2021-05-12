package Tiger01430

import Tiger01430.buildTypes.*
import Tiger01430.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01430")
    name = "Tiger01430"

    vcsRoot(Tiger01430_cVCSroot)

    buildType(Tiger01430_Hi3)
    buildType(Tiger01430_Hi1)
    buildType(Tiger01430_Hi2)
    buildType(Tiger01430_Hi0)
})
