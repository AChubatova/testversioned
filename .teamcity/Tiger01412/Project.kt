package Tiger01412

import Tiger01412.buildTypes.*
import Tiger01412.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01412")
    name = "Tiger01412"

    vcsRoot(Tiger01412_cVCSroot)

    buildType(Tiger01412_Hi3)
    buildType(Tiger01412_Hi0)
    buildType(Tiger01412_Hi2)
    buildType(Tiger01412_Hi1)
})
