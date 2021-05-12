package Tiger01820

import Tiger01820.buildTypes.*
import Tiger01820.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01820")
    name = "Tiger01820"

    vcsRoot(Tiger01820_cVCSroot)

    buildType(Tiger01820_Hi2)
    buildType(Tiger01820_Hi3)
    buildType(Tiger01820_Hi0)
    buildType(Tiger01820_Hi1)
})
