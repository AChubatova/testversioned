package Tiger01421

import Tiger01421.buildTypes.*
import Tiger01421.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01421")
    name = "Tiger01421"

    vcsRoot(Tiger01421_cVCSroot)

    buildType(Tiger01421_Hi3)
    buildType(Tiger01421_Hi2)
    buildType(Tiger01421_Hi1)
    buildType(Tiger01421_Hi0)
})
