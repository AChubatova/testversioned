package Tiger01324

import Tiger01324.buildTypes.*
import Tiger01324.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01324")
    name = "Tiger01324"

    vcsRoot(Tiger01324_cVCSroot)

    buildType(Tiger01324_Hi2)
    buildType(Tiger01324_Hi1)
    buildType(Tiger01324_Hi0)
    buildType(Tiger01324_Hi3)
})
