package Tiger01732

import Tiger01732.buildTypes.*
import Tiger01732.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01732")
    name = "Tiger01732"

    vcsRoot(Tiger01732_cVCSroot)

    buildType(Tiger01732_Hi1)
    buildType(Tiger01732_Hi0)
    buildType(Tiger01732_Hi3)
    buildType(Tiger01732_Hi2)
})
