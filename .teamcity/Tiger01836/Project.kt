package Tiger01836

import Tiger01836.buildTypes.*
import Tiger01836.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01836")
    name = "Tiger01836"

    vcsRoot(Tiger01836_cVCSroot)

    buildType(Tiger01836_Hi1)
    buildType(Tiger01836_Hi2)
    buildType(Tiger01836_Hi3)
    buildType(Tiger01836_Hi0)
})
