package Tiger01622

import Tiger01622.buildTypes.*
import Tiger01622.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01622")
    name = "Tiger01622"

    vcsRoot(Tiger01622_cVCSroot)

    buildType(Tiger01622_Hi2)
    buildType(Tiger01622_Hi3)
    buildType(Tiger01622_Hi0)
    buildType(Tiger01622_Hi1)
})
